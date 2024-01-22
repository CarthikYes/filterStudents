package com.smtspl.Student.filter.service;

import com.smtspl.Student.filter.entity.Student;
import com.smtspl.Student.filter.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;


    @Override
    public List<Student> filterStudents(String name, int age, String fatherName, String gender) {
        return studentRepository.findByNameContainingAndAgeAndFatherNameContainingAndGender(name, age, fatherName, gender);
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> fetchDepartmentList() {
        return studentRepository.findAll();
    }
}
