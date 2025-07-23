package com.rafaela.example.hexagonal.architecture.app.infrastructure.adapters.input.rest.model.response;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentCreateResponse {

    private Long id;
    private String firstName;
    private String lastName;
    private Integer age;
    private String address;
}
