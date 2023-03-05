package com.student.information.system.studentinformationsystem.service;

import com.student.information.system.studentinformationsystem.model.Student;

import java.util.List;

public interface StudentService {

    List<Student> findAll();

    Student findByStudentNumber(long studentNumber);

    Student findByEmail(String email);

    List<Student> findAllByOrderByGpaDesc();

    Student saveOrUpdateStudent(Student student);

    void deleteStudentById(String id);

}
