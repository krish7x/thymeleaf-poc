package com.thymeleaf.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "STUDENT")
public class Student implements Serializable {
    private static final long serialVersionUID = 5123955371183607337L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "Name", nullable = false, length = 100)
    private String name;

    @Column(name = "Dept", nullable = false, length = 50)
    private String department;

    @Column(name = "RollNo", nullable = false)
    private String rollNo;

    @Column(name = "RegNo", nullable = false)
    private String regNo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }
}
