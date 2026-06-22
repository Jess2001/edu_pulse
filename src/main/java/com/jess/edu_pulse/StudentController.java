package com.jess.edu_pulse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @GetMapping
    public List<Student> getAllStudents() {
        return Arrays.asList(
            new Student(1L, "Amina Wanjiru", "Form 1", "East"),
            new Student(2L, "Brian Otieno", "Form 2", "West"),
            new Student(3L, "Cynthia Achieng", "Form 3", "East"),
            new Student(4L, "David Kamau", "Form 4", "West")
        );
    }
}