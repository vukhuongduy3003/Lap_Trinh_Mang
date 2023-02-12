package org.example;

import java.util.Scanner;

public class Bai_3 {
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

    boolean isPrime(Integer n) {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (Integer i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    public void Bai_3() {
        System.out.println("\n________________Bài 3________________");
        Integer integer = InputIntegerPositive(0);
        System.out.print(integer + " số nguyên tố đầu tiên là: ");
        int i = 1;
        int count = 0;
        while (count != 5) {
            if (isPrime(i)) {
                System.out.print(i + ", ");
                count++;
            }
            i++;
        }
    }

}
