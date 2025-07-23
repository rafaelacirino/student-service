package com.rafaela.example.hexagonal.architecture.app.application.ports.input;

import com.rafaela.example.hexagonal.architecture.app.domain.model.Student;

import java.util.List;

public interface StudentServicePort {

    Student findById(Long id);
    List<Student> findAll();
    Student save(Student student);
    Student update(Long id, Student student);
    void delete(Long id);
}
