package com.rafaela.example.hexagonal.architecture.app.infrastructure.adapters.input.rest.mapper;

import com.rafaela.example.hexagonal.architecture.app.domain.model.Student;
import com.rafaela.example.hexagonal.architecture.app.infrastructure.adapters.input.rest.model.request.StudentCreateRequest;
import com.rafaela.example.hexagonal.architecture.app.infrastructure.adapters.input.rest.model.response.StudentCreateResponse;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface StudentRestMapper {

    Student toStudent(StudentCreateRequest request);

    StudentCreateResponse toStudentResponse(Student student);

    List<StudentCreateResponse> toStudentResponseList(List<Student> studentList);
}
