package com.smtspl.Student.filter.controller;

import com.smtspl.Student.filter.entity.Student;
import com.smtspl.Student.filter.error.StudentNotFoundException;
import com.smtspl.Student.filter.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/save-students")
    public Student saveStudent(@Valid @RequestBody Student student) {
        return studentService.saveStudent(student);
    }
    @GetMapping("/students")
    public List<Student> fetchStudentList() {
        return studentService.fetchStudentList();

    }
    @PostMapping("/filter-students")
    public List<Student> filterStudents(@RequestBody StudentFilterRequest filterRequest)
            throws StudentNotFoundException {
        return studentService.filterStudents(
                filterRequest.getName(),
                filterRequest.getAge(),
                filterRequest.getFatherName(),
                filterRequest.getGender()
        );


}}
