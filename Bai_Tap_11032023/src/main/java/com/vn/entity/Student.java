package com.vn.entity;

public class Student extends Person {
    private String university;
    private Integer credits;

    public Student(String name, Integer age, String university) {
        super(name, age);
        super.setProfession("Student");
        this.university = university;
        this.credits = 0;
    }

    public void displayStudent(){
        super.displayPersion();
        System.out.println("University: " + this.university);
        System.out.println("Cumulated credits: " + this.credits);
    }

    public void updateCredits(int moreCredits){
        this.credits += moreCredits;
    }


    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public Integer getCredits() {
        return credits;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                "university='" + university + '\'' +
                ", credits=" + credits +
                '}';
    }
}
