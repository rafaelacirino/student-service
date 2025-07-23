package com.rafaela.example.hexagonal.architecture.app.infrastructure.adapters.input.rest;

import com.rafaela.example.hexagonal.architecture.app.application.ports.input.StudentServicePort;
import com.rafaela.example.hexagonal.architecture.app.infrastructure.adapters.input.rest.mapper.StudentRestMapper;
import com.rafaela.example.hexagonal.architecture.app.infrastructure.adapters.input.rest.model.request.StudentCreateRequest;
import com.rafaela.example.hexagonal.architecture.app.infrastructure.adapters.input.rest.model.response.StudentCreateResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/students")
public class StudentRestController {

    private final StudentServicePort servicePort;
    private final StudentRestMapper restMapper;

    @GetMapping("/v1/api")
    public List<StudentCreateResponse> findAll() {
        return restMapper.toStudentResponseList(servicePort.findAll());
    }

    @GetMapping("/v1/api/{id}")
    public StudentCreateResponse findById(@PathVariable Long id) {
        return restMapper.toStudentResponse(servicePort.findById(id));
    }

    @PostMapping("/v1/api")
    public ResponseEntity<StudentCreateResponse> create(@Valid @RequestBody StudentCreateRequest studentCreateRequest) {
        return ResponseEntity.status(HttpStatus.CREATED).body(
                restMapper.toStudentResponse(
                        servicePort.save(
                                restMapper.toStudent(studentCreateRequest))));
    }

    @PutMapping("/v1/api/{id}")
    public StudentCreateResponse update(@PathVariable Long id,
                                        @Valid @RequestBody StudentCreateRequest studentCreateRequest) {
        return restMapper.toStudentResponse(
                servicePort.update(id, restMapper.toStudent(studentCreateRequest)));
    }

    @DeleteMapping("/v1/api/{id}")
    public void delete(@PathVariable Long id) {
        servicePort.delete(id);
    }
}
