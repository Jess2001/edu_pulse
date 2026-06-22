package com.jess.edu_pulse;

public class Student {
    private Long id;
    private String name;
    private String form; // Form 1, 2, 3, or 4
    private String stream;

    public Student(Long id, String name, String form, String stream) {
        this.id = id;
        this.name = name;
        this.form = form;
        this.stream = stream;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getForm() { return form; }
    public String getStream() { return stream; }
}