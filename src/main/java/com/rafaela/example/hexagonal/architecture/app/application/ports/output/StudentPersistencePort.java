package com.rafaela.example.hexagonal.architecture.app.application.ports.output;

import com.rafaela.example.hexagonal.architecture.app.domain.model.Student;

import java.util.List;
import java.util.Optional;

// funcionalidades para persistir el modelo en la base de datos
public interface StudentPersistencePort {

    Optional<Student> findById(Long id);
    List<Student> findAll();
    Student save(Student student);
    void deleteById(Long id);
}
