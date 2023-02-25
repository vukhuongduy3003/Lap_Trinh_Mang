package com.vn;

import java.util.Scanner;

/**
 * Hello world!
 */
public class Program {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        new UseCircle();

        Date date = new Date();
        System.out.print("Nhập ngày: ");
        date.setDay(scanner.nextInt());
//        do {
//            scanner.nextLine();
//            date.setDay(InputIntegerPositive());
//            if (1 < date.getDay() && date.getDay() > 31) {
//                System.out.print("Không có ngày này. Mời bạn nhập lại: ");
//            }
//        } while (1 < date.getDay() && date.getDay() > 31);
        Boolean check = true;
        System.out.print("Nhập tháng: ");
        date.setMonth(scanner.nextInt());
//        do {
//            date.setMonth(InputIntegerPositive());
//            if (1 < date.getMonth() && date.getMonth() > 12) {
//                System.out.print("Không có tháng này. Mời bạn nhập lại: ");
//                check = false;
//            } else if (date.getDay() == 31) {
//                switch (date.getMonth()) {
//                    case 2, 4, 6, 9, 11 -> {
//                        System.out.print("Ngày 31 không có trong tháng này. Mời bạn nhập lại: ");
//                        check = false;
//                    }
//                }
//            } else if (date.getDay() == 30) {
//                switch (date.getMonth()) {
//                    case 1, 3, 5, 7, 8, 10, 12 -> {
//                        System.out.print("Ngày 30 không có trong tháng này. Mời bạn nhập lại: ");
//                        check = false;
//                    }
//                }
//            } else if (date.getDay() == 28 || date.getDay() == 29) {
//                switch (date.getMonth()) {
//                    case 1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 -> {
//                        System.out.print("Ngày 28, 29 không có trong tháng này. Mời bạn nhập lại: ");
//                        check = false;
//                    }
//                }
//            }
//        } while (!check);
        System.out.print("Nhập năm: ");
        date.setYear(scanner.nextInt());
//        do {
//            date.setYear(InputIntegerPositive());
//            if (date.getDay() == 29 && !date.isLeapYear()) {
//                System.out.print("Năm bạn vừa nhập không phải là năm nhuận bởi vì ở trên bạn nhập ngày là ngày 29. Mời bạn nhập lại: ");
//                check = false;
//            } else if (date.getDay() == 28 && date.isLeapYear()) {
//                System.out.print("Năm bạn vừa nhập là năm nhuận bởi vì ở trên bạn nhập ngày là ngày 28 nên sai. Mời bạn nhập lại: ");
//                check = false;
//            }
//        } while (!check);
        System.out.println(date);
        System.out.println(date.isLeapYear() ? "Năm bạn vừa nhập là năm nhuận." : "Năm bạn vừa nhập không là năm nhuận.");
    }

    private static Integer InputIntegerPositive() {
        Integer integerPositive = 0;
        do {
            try {
                System.out.print("Mời bạn nhập số nguyên dương: ");
                integerPositive = Integer.parseInt(scanner.nextLine());
                if (integerPositive < 0) {
                    System.out.println("Số bạn vừa nhập không phải là số nguyên dương!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Lựa chọn phải là kiểu số nguyên.");
            }
        } while (integerPositive < 0);
        return integerPositive;
    }
}
