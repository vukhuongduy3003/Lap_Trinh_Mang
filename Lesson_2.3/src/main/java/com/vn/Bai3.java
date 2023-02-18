package com.vn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai3 {
    private Scanner scanner = new Scanner(System.in);

    public Bai3() {
        List<Float> floatList1 = new ArrayList<>();
        List<Float> floatList2 = new ArrayList<>();
        List<Float> totalList = new ArrayList<>();
        Integer m = 0, n = 0;
        boolean check = true;
        System.out.print("Nhập số lượng phần tử của mảng m là: ");
        m = InputIntegerPositive(m);
        for (int i = 0; i < m; i++) {
            System.out.print("Nhập phần tử thứ " + i + " là: ");
            do {
                try {
                    floatList1.add(Float.parseFloat(scanner.nextLine()));
                } catch (NumberFormatException e) {
                    System.out.println("Lựa chọn phải là kiểu số thực.");
                    check = false;
                }
            }
            while (!check);
        }
        System.out.print("Nhập số lượng phần tử của mảng n là: ");
        n = InputIntegerPositive(n);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + " là: ");
            do {
                try {
                    floatList1.add(Float.parseFloat(scanner.nextLine()));
                } catch (NumberFormatException e) {
                    System.out.println("Lựa chọn phải là kiểu số thực.");
                    check = false;
                }
            }
            while (!check);
        }
        totalList.addAll(floatList1);
        totalList.addAll(floatList2);
        System.out.println("2 mảng sau khi đã cộng vào là: " + totalList);
    }

    public Integer InputIntegerPositive(Integer integerPositive) {
        do {
            try {
                integerPositive = Integer.parseInt(scanner.nextLine());
                if (integerPositive < 0) {
                    System.out.println("Số bạn vừa nhập không phải là số nguyên dương!");
                    System.out.print("Mời bạn nhập lại: ");
                } else if (integerPositive == 0) {
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
