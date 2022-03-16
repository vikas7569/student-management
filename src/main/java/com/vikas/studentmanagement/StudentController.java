package com.vikas.studentmanagement;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/all")
    public List<Student> getAllStudent(){
        List<Student> studentList = new ArrayList<>();
        Student student1 = new Student(1,"vikas",20);
        Student student2 = new Student(2,"sachin",30);
        Student student3 = new Student(3,"arvind",31);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        return studentList;
    }
}
