package com.student.information.system.studentinformationsystem.controller;

import com.student.information.system.studentinformationsystem.model.Student;
import com.student.information.system.studentinformationsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping(value = "/")
    public List<Student> getAllStudents() {
        return studentService.findAll();
    }

    @GetMapping(value = "/byStudentNumber/{studentNumber}")
    public Student getStudentByStudentNumber(@PathVariable("studentNumber") Long studentNumber) {
        return studentService.findByStudentNumber(studentNumber);
    }

    @GetMapping(value = "/byEmail/{email}")
    public Student getStudentByEmail(@PathVariable("email") String email) {
        return studentService.findByEmail(email);
    }

    @GetMapping(value = "/orderByGpa")
    public List<Student> findAllByOrderByGpaDesc() {
        return studentService.findAllByOrderByGpaDesc();
    }

    @PostMapping(value = "/save")
    public ResponseEntity<?> saveOrUpdateStudent(@RequestBody Student Student) {
        studentService.saveOrUpdateStudent(Student);
        return new ResponseEntity("Student added successfully", HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete/{studentNumber}")
    public ResponseEntity<?> deleteStudentByStudentNumber(@PathVariable long studentNumber) {
        studentService.deleteStudentById(studentService.findByStudentNumber(studentNumber).getId());
        return new ResponseEntity("Student deleted successfully", HttpStatus.OK);
    }
}
