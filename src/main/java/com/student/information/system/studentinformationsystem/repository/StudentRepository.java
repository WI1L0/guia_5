package com.student.information.system.studentinformationsystem.repository;

import com.student.information.system.studentinformationsystem.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface StudentRepository extends MongoRepository <Student, String> {

    Student findByStudentNumber(long studentNumber);

    Student findByEmail(String email);

    List<Student> findAllByOrderByGpaDesc();

}
