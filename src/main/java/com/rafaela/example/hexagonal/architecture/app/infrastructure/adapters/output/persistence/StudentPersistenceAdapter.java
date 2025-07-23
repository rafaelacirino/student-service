package com.rafaela.example.hexagonal.architecture.app.infrastructure.adapters.output.persistence;

import com.rafaela.example.hexagonal.architecture.app.application.ports.output.StudentPersistencePort;
import com.rafaela.example.hexagonal.architecture.app.domain.model.Student;

import java.util.List;
import java.util.Optional;

public class StudentPersistenceAdapter implements StudentPersistencePort {

    @Override
    public Optional<Student> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Student> findAll() {
        return List.of();
    }

    @Override
    public Student save(Student student) {
        return null;
    }

    @Override
    public void deleteById(Long id) {
        //
    }
}
