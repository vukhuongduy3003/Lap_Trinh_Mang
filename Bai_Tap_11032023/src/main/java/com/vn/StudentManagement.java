package com.vn;

import com.vn.entity.Person;
import com.vn.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentManagement {
    public StudentManagement() {
        Person someone = new Person("Nguyen Ha Dong",18);
        someone.displayPersion();
        System.out.println("\nDong becomes a student at HUST");
        String name = someone.getName();
        int age = someone.getAge();
        Student bkStudent = new Student(name, age, "HUST");
        bkStudent.displayStudent();
        System.out.println("\nDong has just passed the Java Programming course");
        bkStudent.updateCredits(3);
        bkStudent.displayStudent();
        List<Student> students = new ArrayList<>();
        students.forEach(System.out::println);
    }
}
