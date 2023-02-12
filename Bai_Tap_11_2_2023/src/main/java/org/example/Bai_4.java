package org.example;

import java.util.Scanner;

public class Bai_4 {
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

    public void for_Bai_4() {
        System.out.println("\n________________Bài 4.a________________");
        Integer integer = InputIntegerPositive(0);
        Integer ans = 0;
        for (int t = integer; t > 0; t /= 10) {
            ans = ans * 10 + t % 10;
        }
        System.out.println(ans);
    }

    public void while_Bai_4() {
        System.out.println("\n________________Bài 4.b________________");
        Integer integer = InputIntegerPositive(0);
        Integer ans = 0;
        while (integer > 0) {
            ans = ans * 10 + integer % 10;
            integer /= 10;
        }
        System.out.println(ans);
    }

}
