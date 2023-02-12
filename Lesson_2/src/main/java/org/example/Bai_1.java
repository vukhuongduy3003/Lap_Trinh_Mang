package org.example;

import org.example.pack.name.StudentMark;

import java.util.Scanner;

public class Bai_1 {
    public static Scanner scanner = new Scanner(System.in);
    public static StudentMark input() {
        StudentMark studentMark = new StudentMark();
        System.out.print("Nhập số báo danh: ");
        studentMark.setRollNumber(scanner.nextInt());
        System.out.print("Nhập họ tên sinh viên: ");
        scanner.nextLine();
        studentMark.setName(scanner.nextLine());
        System.out.print("Nhập tên lớp: ");
        studentMark.setClassName(scanner.nextLine());
        System.out.print("Nhập môn học: ");
        studentMark.setSubject(scanner.nextLine());
        System.out.print("Nhập điểm: ");
        studentMark.setMark(scanner.nextFloat());
        return studentMark;
    }

    public static void output(StudentMark studentMark) {
        System.out.println("Số báo danh: " + studentMark.getRollNumber());
        System.out.println("Họ tên sinh viên: " + studentMark.getName());
        System.out.println("Lớp: " + studentMark.getClassName());
        System.out.println("Môn: " + studentMark.getSubject());
        System.out.println("Điểm: " + studentMark.getMark());
    }

    public static void Bai_1() {
        System.out.println("Nhập thông tin sinh viên thứ 1: ");
        StudentMark studentMark1 = Bai_1.input();
        System.out.println("Nhập thông tin sinh viên thứ 2: ");
        StudentMark studentMark2 = Bai_1.input();
        System.out.println("Thông tin sinh viên có điểm cao nhất:");
        if (studentMark1.getMark() > studentMark2.getMark()) {
            Bai_1.output(studentMark1);
        } else {
            Bai_1.output(studentMark2);
        }
    }
}
