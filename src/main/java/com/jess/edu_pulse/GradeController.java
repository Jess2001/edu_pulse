package com.jess.edu_pulse;

import org.springframework.web.bind.annotation.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/grades")
public class GradeController {

    private List<Grade> grades = Arrays.asList(
        new Grade(1L, 1L, 1L, "Mathematics", 78, "B"),
        new Grade(2L, 1L, 2L, "English", 85, "A"),
        new Grade(3L, 1L, 3L, "Biology", 60, "C"),
        new Grade(4L, 2L, 1L, "Mathematics", 90, "A"),
        new Grade(5L, 2L, 2L, "English", 72, "B"),
        new Grade(6L, 3L, 1L, "Mathematics", 55, "D"),
        new Grade(7L, 3L, 3L, "Biology", 88, "A"),
        new Grade(8L, 4L, 4L, "Chemistry", 91, "A"),
        new Grade(9L, 4L, 5L, "History", 67, "C")
    );

    @GetMapping
    public List<Grade> getAllGrades() {
        return grades;
    }

    @GetMapping("/student/{studentId}")
    public List<Grade> getGradesByStudent(@PathVariable Long studentId) {
        return grades.stream()
            .filter(g -> g.getStudentId().equals(studentId))
            .collect(Collectors.toList());
    }
}