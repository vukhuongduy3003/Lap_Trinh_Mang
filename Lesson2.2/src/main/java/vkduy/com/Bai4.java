package vkduy.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai4 {
    Scanner scanner = new Scanner(System.in);
    public Integer InputIntegerPositive(Integer integerPositive) {
        do {
            try {
                integerPositive = Integer.parseInt(scanner.nextLine());
                if (integerPositive < 0) {
                    System.out.println("Số bạn vừa nhập không phải là số nguyên dương!");
                    System.out.print("Mời bạn nhập lại: ");
                }
                else if(integerPositive == 0) {
                    System.out.println("Số 0 không phải là số nguyên âm và không phải là số nguyên dương!");
                    System.out.print("Mời bạn nhập lại: ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Lựa chọn phải là kiểu số nguyên.");
                System.out.print("Mời bạn nhập lại: ");
            }
        } while (integerPositive <= 0);
        return integerPositive;
    }

    private Student inputStudent() {
        Student student = new Student();
        System.out.print("Nhập họ tên sinh viên: ");
        student.setFullName(scanner.nextLine());
        do {
            student.setMark(-1f);
            try {
                System.out.print("Nhập điểm sinh viên: ");
                student.setMark(Float.parseFloat(scanner.nextLine()));
                if (student.getMark() < 0) {
                    System.out.println("Điểm số không được âm!");
                }
                else if (student.getMark() > 10) {
                    System.out.println("Điểm số phải từ 0 -> 10!");
                }
            }
            catch (NumberFormatException e) {
                System.out.println("Điểm số phải là kiểu số thực!");
            }
        } while (student.getMark() < 0 || student.getMark() > 10);
        return student;
    }

    public List<Student> inputStudentList() {
        Integer n = 0;
        List<Student> studentList = new ArrayList<>();
        System.out.print("Nhập số lượng học sinh: ");
        n = InputIntegerPositive(n);
        for (int i = 0; i < n; i++) {
            System.out.println("Thông tin sinh viên thứ " + (i + 1) + " là: ");
                    studentList.add(inputStudent());
        }
        return studentList;
    }

    public void outputStudentList(List<Student> studentList) {
        System.out.println("Danh sách sinh viên tăng dần theo điểm là: ");
        studentList.sort(new Student());
        studentList.forEach(System.out::println);
    }

}
