package com.smtspl.Student.filter.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentFilterRequest {
    private String name;
    private int age;
    private String fatherName;
    private String gender;
}
