package org.example;

import java.util.Scanner;

public class Bai_2 {
    private final Scanner scanner = new Scanner(System.in);

    private Integer InputIntegerPositive(Integer integerPositive) {
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

    public void Bai_2() {
        System.out.println("\n________________Bài 2________________");
        Integer integer = InputIntegerPositive(0);
        for (int i = 1; i <= integer; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ", ");
            }
        }
    }
}
