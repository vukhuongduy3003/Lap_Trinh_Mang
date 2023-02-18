package com.vn;

import java.util.Scanner;

public class Bai1 {

    private Scanner scanner = new Scanner(System.in);
    public Bai1() {
        System.out.print("Nhập chiều cao của kim tự tháp: ");
        int height = 0;
        height = InputIntegerPositive(height);

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

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

}
