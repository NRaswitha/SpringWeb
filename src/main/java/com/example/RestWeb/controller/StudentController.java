package com.example.RestWeb.controller;

import java.util.*;
import com.example.RestWeb.model.Student;
import com.example.RestWeb.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentrecords;//creating an instance
    @GetMapping("/hi")
    public List<Student> fetchStudents()
    {
        return studentrecords.fetchAllStudents();
    }

}
