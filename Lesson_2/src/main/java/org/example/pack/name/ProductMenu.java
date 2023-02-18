package org.example.pack.name;

import java.util.*;
import java.util.stream.Collectors;

public class ProductMenu {
    public static Scanner scanner = new Scanner(System.in);

    public static Product input() {
        Product product = new Product();
        System.out.print("Nhập tên hàng hoá: ");
        product.setNameProduct(scanner.nextLine());
        System.out.print("Nhập nhà sản xuất: ");
        product.setCompany(scanner.nextLine());
        System.out.print("Nhập giá bán: ");
        Integer price = 0;
        price = InputIntegerPositive(price);
        product.setPrice(price);
        return product;
    }

    public static void output(Product product) {
        System.out.println("Tên hàng hoá: " + product.getNameProduct());
        System.out.println("Nhà sản xuất: " + product.getCompany());
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
        System.out.println("1. Nhập thông tin cho n sản phẩm.");
        System.out.println("2. Hiển thị thông tin vừa nhập.");
        System.out.println("3. Sắp xếp thông tin giảm dần theo giá và hiển thị.");
        System.out.println("4. Thoát.");
    }

    public static void ProductMenu() {
        Integer choose = 0, n = 0;
        List<Product> productList = new ArrayList<>();
        do {
            MenuBai2();
            try {
                System.out.print("Mời bạn nhập lựa chọn: ");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1 -> {
                        System.out.print("Mời bạn nhập số sản phẩm: ");
                        n = InputIntegerPositive(n);
                        for (int i = 0; i < n; i++) {
                            System.out.println("Nhập thông tin hàng hoá thứ " + (i + 1) + " là:");
                            productList.add(input());
                        }
                    }
                    case 2 -> {
                        System.out.println("Hiển thị thông tin: ");
                        for (int i = 0; i < productList.size(); i++) {
                            System.out.println("Thông tin hàng hoá thứ " + (i + 1) + " là:");
                            output(productList.get(i));
                        }
                    }
                    case 3 -> {
                        Collections.sort(productList, new Product());
                        System.out.println("Danh sách hàng hoá giảm dần theo giá là:");
                        for (int i = 0; i < productList.size(); i++) {
                            System.out.println("Thông tin hàng hoá thứ " + (i + 1) + " là:");
                            output(productList.get(i));
                        }
                    }
                    case 4 -> System.out.println("Đã thoát chương trình!");
                    default -> System.out.println("Không có lựa chọn!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Lựa chọn phải là kiểu số nguyên.");
            }
        } while (choose != 4);
    }

}
