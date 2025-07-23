package com.rafaela.example.hexagonal.architecture.app.infrastructure.adapters.input.rest.model.request;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentCreateRequest {

    @NotEmpty(message = "Field first name cannot be empty")
    private String firstName;

    @NotEmpty(message = "Field last name cannot be empty")
    private String lastName;

    @NotNull(message = "Field age cannot be null")
    private Integer age;

    @NotEmpty(message = "Field address cannot be empty")
    private String address;
}
