package com.thymeleaf.service.impl;

import com.thymeleaf.domain.Student;
import com.thymeleaf.dto.StudentDTO;
import com.thymeleaf.repository.StudentRepository;
import com.thymeleaf.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void addStudent(Student student) {
       studentRepository.save(student);
    }



    @Override
    public List<StudentDTO> getStudents() {
        List<StudentDTO> studentDTOS = new ArrayList<>();

        List<Student> students = studentRepository.findAll();

        for(Student student: students) {
            StudentDTO studentDTO = new StudentDTO();
            studentDTO.setId(student.getId());
            studentDTO.setName(student.getName());
            studentDTO.setDepartment(student.getDepartment());
            studentDTO.setRollNo(student.getRollNo());
            studentDTO.setRegNo(student.getRegNo());

            studentDTOS.add(studentDTO);
        }
        return studentDTOS;
    }
}
