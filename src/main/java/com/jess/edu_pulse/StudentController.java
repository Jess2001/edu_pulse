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
            new Student(2L, "Brian Otieno", "Form 1", "West"),
            new Student(3L, "Cynthia Achieng", "Form 1", "East"),
            new Student(4L, "David Kamau", "Form 2", "West"),
            new Student(5L, "Esther Njeri", "Form 2", "East"),
            new Student(6L, "Felix Omondi", "Form 2", "West"),
            new Student(7L, "Grace Waweru", "Form 3", "East"),
            new Student(8L, "Hassan Mwangi", "Form 3", "West"),
            new Student(9L, "Irene Chebet", "Form 3", "East"),
            new Student(10L, "James Kipchoge", "Form 4", "West"),
            new Student(11L, "Karen Auma", "Form 4", "East"),
            new Student(12L, "Liam Mutua", "Form 4", "West")
        );
    }
}