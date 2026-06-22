package com.jess.edu_pulse;

public class Grade {
    private Long id;
    private Long studentId;
    private Long subjectId;
    private String subjectName;
    private int score;
    private String grade;

    public Grade(Long id, Long studentId, Long subjectId, String subjectName, int score, String grade) {
        this.id = id;
        this.studentId = studentId;
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.score = score;
        this.grade = grade;
    }

    public Long getId() { return id; }
    public Long getStudentId() { return studentId; }
    public Long getSubjectId() { return subjectId; }
    public String getSubjectName() { return subjectName; }
    public int getScore() { return score; }
    public String getGrade() { return grade; }

}
