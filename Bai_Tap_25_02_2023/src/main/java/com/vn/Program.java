package com.vn;

import java.util.Scanner;

/**
 * Hello world!
 */
public class Program {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        new UseCircle();

        boolean check;
        Date date = new Date();
        System.out.print("Nhập ngày: ");
        do {
            date.setDay(InputIntegerPositive());
            if (date.getDay() > 31) {
                System.out.print("Không có ngày này. Mời bạn nhập lại: ");
            }
        } while (date.getDay() > 31);
        System.out.print("Nhập tháng: ");
        do {
            date.setMonth(InputIntegerPositive());
            check = true;
            if (date.getMonth() > 12) {
                System.out.print("Không có tháng này. Mời bạn nhập lại: ");
                check = false;
            } else if (date.getDay() == 31) {
                switch (date.getMonth()) {
                    case 2, 4, 6, 9, 11 -> {
                        System.out.print("Ngày 31 không có trong tháng này. Mời bạn nhập lại: ");
                        check = false;
                    }
                }
            } else if (date.getDay() == 30) {
                switch (date.getMonth()) {
                    case 1, 3, 5, 7, 8, 10, 12 -> {
                        System.out.print("Ngày 30 không có trong tháng này. Mời bạn nhập lại: ");
                        check = false;
                    }
                }
            }
        } while (!check);
        System.out.print("Nhập năm: ");
        do {
            date.setYear(InputIntegerPositive());
            check = true;
            if (date.getDay() == 29 && date.getMonth() == 2 && !date.isLeapYear()) {
                System.out.print("Năm bạn vừa nhập không phải là năm nhuận bởi vì ở trên bạn nhập ngày là ngày 29 tháng 2. Mời bạn nhập lại: ");
                check = false;
            }
        } while (!check);
        System.out.println(date);
        System.out.println(date.isLeapYear() ? "Năm bạn vừa nhập là năm nhuận." : "Năm bạn vừa nhập không là năm nhuận.");
    }

    private static Integer InputIntegerPositive() {
        Integer integerPositive = 0;
        do {
            try {
                integerPositive = Integer.parseInt(scanner.nextLine());
                if (integerPositive <= 0) {
                    System.out.print("Số bạn vừa nhập không phải là số nguyên dương! Mời bạn nhập lại: ");
                }
            } catch (NumberFormatException e) {
                System.out.print("Lựa chọn phải là kiểu số nguyên. Mời bạn nhập lại: ");
            }
        } while (integerPositive <= 0);
        return integerPositive;
    }
}
