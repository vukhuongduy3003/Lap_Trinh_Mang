package com.vn;

import com.vn.entity.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Bai2 {
    public static Scanner scanner = new Scanner(System.in);

    public Bai2() {
        Integer choose = 0, n = 0;
        List<Product> productList = new ArrayList<>();
        do {
            MenuBai2();
            try {
                scanner.nextLine();
                System.out.print("Mời bạn nhập lựa chọn: ");
                choose = Integer.parseInt(scanner.nextLine());
                scanner.nextLine();
                switch (choose) {
                    case 1 -> {
                        System.out.print("Mời bạn nhập số sản phẩm: ");
                        n = InputIntegerPositive(n);
                        for (int i = 0; i < n; i++) {
                            System.out.println("Nhập thông tin hàng hoá thứ " + (i + 1) + " là:");
                            scanner.nextLine();
                            productList.add(input());
                        }
                        System.out.println("Hiển thị thông tin hàng hoá: ");
                        productList.forEach(System.out::println);
                    }
                    case 2 -> {
                        System.out.println("Danh sách hàng hóa có mặt hàng “milk”:");
                        boolean check = false;
                        for (Product product : productList) {
                            if (product.getNameProduct().toLowerCase().contains("milk")) {
                                System.out.println(product);
                                check = true;
                            }
                        }
                        if (!check) {
                            System.out.println("Không tìm thấy mặt hàng sữa nào!");
                        }
                    }
                    case 3 -> {
                        System.out.println("Sắp xếp theo thứ tự giảm dần theo số lượng là:");
                        productList.sort(new Product());
                        productList.forEach(System.out::println);
                    }
                    case 4 -> System.out.println("Đã thoát chương trình!");
                    default -> System.out.println("Không có lựa chọn!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Lựa chọn phải là kiểu số nguyên.");
            }
        } while (choose != 4);
    }

    public Product input() {
        Product product = new Product();
        System.out.print("Nhập mã hàng hoá: ");
        product.setIdProduct(scanner.nextLine());
        System.out.print("Nhập tên hàng hoá: ");
        product.setNameProduct(scanner.nextLine());
        System.out.print("Nhập số lượng: ");
        product.setAmount(scanner.nextFloat());
        System.out.print("Nhập giá bán: ");
        product.setPrice(scanner.nextFloat());
        return product;
    }

    public void output(Product product) {
        System.out.println("Mã hàng hoá: " + product.getIdProduct());
        System.out.println("Tên hàng hoá: " + product.getNameProduct());
        System.out.println("Số lượng: " + product.getAmount());
        System.out.println("Giá bán: " + product.getPrice());
    }

    private static Integer InputIntegerPositive(Integer integerPositive) {
        do {
            try {
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

    public static void MenuBai2() {
        System.out.println("1. Khai báo mảng có n phần tử kiểu Product.");
        System.out.println("2. Tìm trong danh sách hàng hóa có mặt hàng “milk” hay không?.");
        System.out.println("3. Sắp xếp theo thứ tự giảm dần theo số lượng.");
        System.out.println("4. Thoát.");
    }

}
