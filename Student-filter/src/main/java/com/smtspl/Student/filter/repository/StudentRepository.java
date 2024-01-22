package com.smtspl.Student.filter.repository;

import com.smtspl.Student.filter.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByNameContainingAndAgeAndFatherNameContainingAndGender(String name, int age, String fatherName, String gender);
}
