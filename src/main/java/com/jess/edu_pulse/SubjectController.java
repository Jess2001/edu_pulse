package com.jess.edu_pulse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/subjects")
public class SubjectController {

    @GetMapping
    public List<Subject> getAllSubjects() {
        return Arrays.asList(
            new Subject(1L, "Mathematics"),
            new Subject(2L, "English"),
            new Subject(3L, "Biology"),
            new Subject(4L, "Chemistry")
        );
    }
}
