package com.student.information.system.studentinformationsystem.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Setter
@Getter
@Document(collection = "students")
public class Student {

    @Id
    private String id;
    private String name;
    private long studentNumber;
    private String email;
    private List<String> courseList;
    private float gpa;
}
