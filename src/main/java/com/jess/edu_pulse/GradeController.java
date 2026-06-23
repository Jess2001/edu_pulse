package com.jess.edu_pulse;

import org.springframework.web.bind.annotation.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/grades")
public class GradeController {

    private List<Grade> grades = Arrays.asList(
        // Form 1 - Amina
        new Grade(1L, 1L, 1L, "Mathematics", 78, "B+"),
        new Grade(2L, 1L, 2L, "English", 85, "A"),
        new Grade(3L, 1L, 3L, "Biology", 60, "C"),
        // Form 1 - Brian
        new Grade(4L, 2L, 1L, "Mathematics", 90, "A"),
        new Grade(5L, 2L, 2L, "English", 72, "B+"),
        new Grade(6L, 2L, 3L, "Biology", 88, "A"),
        // Form 1 - Cynthia
        new Grade(7L, 3L, 1L, "Mathematics", 55, "C+"),
        new Grade(8L, 3L, 2L, "English", 68, "B"),
        new Grade(9L, 3L, 3L, "Biology", 74, "B+"),
        // Form 2 - David
        new Grade(10L, 4L, 1L, "Mathematics", 91, "A"),
        new Grade(11L, 4L, 4L, "Chemistry", 67, "B"),
        new Grade(12L, 4L, 5L, "History", 80, "A"),
        // Form 2 - Esther
        new Grade(13L, 5L, 1L, "Mathematics", 76, "B+"),
        new Grade(14L, 5L, 2L, "English", 83, "A"),
        new Grade(15L, 5L, 3L, "Biology", 70, "B+"),
        // Form 2 - Felix
        new Grade(16L, 6L, 1L, "Mathematics", 62, "C+"),
        new Grade(17L, 6L, 4L, "Chemistry", 58, "C+"),
        new Grade(18L, 6L, 5L, "History", 74, "B+"),
        // Form 3 - Grace
        new Grade(19L, 7L, 1L, "Mathematics", 88, "A"),
        new Grade(20L, 7L, 2L, "English", 92, "A"),
        new Grade(21L, 7L, 3L, "Biology", 79, "B+"),
        // Form 3 - Hassan
        new Grade(22L, 8L, 1L, "Mathematics", 65, "B"),
        new Grade(23L, 8L, 4L, "Chemistry", 71, "B+"),
        new Grade(24L, 8L, 5L, "History", 60, "C+"),
        // Form 3 - Irene
        new Grade(25L, 9L, 1L, "Mathematics", 77, "B+"),
        new Grade(26L, 9L, 2L, "English", 84, "A"),
        new Grade(27L, 9L, 3L, "Biology", 69, "B"),
        // Form 4 - James
        new Grade(28L, 10L, 1L, "Mathematics", 94, "A"),
        new Grade(29L, 10L, 4L, "Chemistry", 88, "A"),
        new Grade(30L, 10L, 5L, "History", 76, "B+"),
        // Form 4 - Karen
        new Grade(31L, 11L, 1L, "Mathematics", 70, "B+"),
        new Grade(32L, 11L, 2L, "English", 78, "B+"),
        new Grade(33L, 11L, 3L, "Biology", 85, "A"),
        // Form 4 - Liam
        new Grade(34L, 12L, 1L, "Mathematics", 63, "C+"),
        new Grade(35L, 12L, 4L, "Chemistry", 72, "B+"),
        new Grade(36L, 12L, 5L, "History", 68, "B")
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