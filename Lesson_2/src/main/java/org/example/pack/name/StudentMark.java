package org.example.pack.name;

public class StudentMark {
    private Integer rollNumber;
    private String name;
    private String className;
    private String subject;
    private Float mark;

    public StudentMark() {
    }

    public StudentMark(Integer rollNumber, String name, String className, String subject, Float mark) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.className = className;
        this.subject = subject;
        this.mark = mark;
    }

    public Integer getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(Integer rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Float getMark() {
        return mark;
    }

    public void setMark(Float mark) {
        this.mark = mark;
    }

}
