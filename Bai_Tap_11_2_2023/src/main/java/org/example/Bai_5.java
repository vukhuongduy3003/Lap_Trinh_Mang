package org.example;

import java.util.Scanner;

public class Bai_5 {
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

    public void Bai_5() {
        System.out.println("\n________________Bài 5________________");
        String s = String.valueOf(InputIntegerPositive(0));
        for (int i = 0; i < s.length(); i++) {
            System.out.println("Vị trí " + (i + 1) + " là: " + s.charAt(i));
        }
    }
}
