package com.thymeleaf.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class StudentDTO implements Serializable {
    private static final long serialVersionUID = 2655802370554424387L;

    private Long id;
    private String name;
    private String Department;
    private String rollNo;
    private String regNo;
}
