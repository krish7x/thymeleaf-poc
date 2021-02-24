package com.thymeleaf.controller;


import com.thymeleaf.dto.StudentDTO;
import com.thymeleaf.service.StudentService;
import com.thymeleaf.domain.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {

    StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/")
    public String showHome(Model model) {
        return "index";
    }

    @GetMapping("/registration_form")
    public String showRegistrationForm(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);
        return "registration_form";
    }

    @PostMapping("/save")
    public String saveStudent(@ModelAttribute Student student, Model model) {
        model.addAttribute("student", student);
        studentService.addStudent(student);
        return "display_form";
    }

    @GetMapping("/home")
    public String getStudents(Model model) {
        model.addAttribute("students", studentService.getStudents());
        return "home";
    }

}
