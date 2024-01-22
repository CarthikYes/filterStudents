package com.smtspl.Student.filter.service;

import com.smtspl.Student.filter.entity.Student;
import com.smtspl.Student.filter.error.StudentNotFoundException;

import java.util.List;

public interface StudentService {

    List<Student> filterStudents(String name, int age, String fatherName, String gender) throws StudentNotFoundException;

   public Student saveStudent(Student student);

    List<Student> fetchStudentList();
}