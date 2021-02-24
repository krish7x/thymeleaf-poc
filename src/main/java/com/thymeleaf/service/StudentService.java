package com.thymeleaf.service;


import com.thymeleaf.domain.Student;
import com.thymeleaf.dto.StudentDTO;

import java.util.List;

public interface StudentService {
    void addStudent(Student student);
    List<StudentDTO> getStudents();
}
