package com.example.RestWeb.service;
import java.util.List;
import com.example.RestWeb.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StudentService {

public List<Student> fetchAllStudents() {
    List<Student> ls = new ArrayList<Student>();
    ls.add(new Student("gods","MPC","Nice"));
    ls.add(new Student("hi","MP","Nicenooo"));
    ls.add(new Student("hello","MPMC","Nicemooo"));
    ls.add(new Student("namastae","MPCV","Nicekooo"));
    return ls;

}

}
