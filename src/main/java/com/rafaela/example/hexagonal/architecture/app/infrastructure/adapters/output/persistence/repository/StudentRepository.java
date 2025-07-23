package com.rafaela.example.hexagonal.architecture.app.infrastructure.adapters.output.persistence.repository;

import com.rafaela.example.hexagonal.architecture.app.infrastructure.adapters.output.persistence.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Long> {
}
