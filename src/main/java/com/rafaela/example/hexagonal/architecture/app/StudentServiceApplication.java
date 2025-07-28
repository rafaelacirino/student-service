package com.rafaela.example.hexagonal.architecture.app;

import com.rafaela.example.hexagonal.architecture.app.infrastructure.adapters.output.persistence.entity.StudentEntity;
import com.rafaela.example.hexagonal.architecture.app.infrastructure.adapters.output.persistence.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class StudentServiceApplication implements CommandLineRunner {

	private final StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(StudentServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<StudentEntity> entities = Arrays.asList(
			new StudentEntity(null, "Rafaela", "Sanches", 12, "Av New York"),
			new StudentEntity(null, "Camila", "Perez", 18, "Av Mayor"),
			new StudentEntity(null, "Joana", "Sanz", 15, "Av Colombia"),
			new StudentEntity(null, "Mirela", "Puñol", 16, "Av Argentina")
		);
		studentRepository.saveAll(entities);
	}
}
