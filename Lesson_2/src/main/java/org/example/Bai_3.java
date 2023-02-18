package org.example;

import org.example.pack.name.Product;
import org.example.pack.name.ProductB3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Bai_3 {
    public static Scanner scanner = new Scanner(System.in);

    public ProductB3 input() {
        ProductB3 product = new ProductB3();
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

    public void output(ProductB3 product) {
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

    public static void MenuBai3() {
        System.out.println("1. Khai báo mảng có n phần tử kiểu Product.");
        System.out.println("2. Gọi nhập thông tin cho các phần tử của mảng.");
        System.out.println("3. Tìm ra sản phẩm nào có giá bán cao nhất.");
        System.out.println("4. Sắp xếp theo thứ tự giảm dần của giá.");
        System.out.println("5. Tìm trong danh sách hàng hóa có mặt hàng “Sữa” hay không?.");
        System.out.println("6. Thoát.");
    }

    public Bai_3() {
        Integer choose = 0, n = 0;
        List<ProductB3> productList = new ArrayList<>();
        do {
            MenuBai3();
            try {
                System.out.print("Mời bạn nhập lựa chọn: ");
                choose = Integer.parseInt(scanner.nextLine());
                scanner.nextLine();
                switch (choose) {
                    case 1 -> {
                        System.out.print("Mời bạn nhập số sản phẩm: ");
                        n = InputIntegerPositive(n);
                    }
                    case 2 -> {
                        for (int i = 0; i < n; i++) {
                            System.out.println("Nhập thông tin hàng hoá thứ " + (i + 1) + " là:");
                            scanner.nextLine();
                            productList.add(input());
                        }
                        System.out.println("Hiển thị thông tin: ");
                        for (int i = 0; i < productList.size(); i++) {
                            System.out.println("Thông tin hàng hoá thứ " + (i + 1) + " là:");
                            output(productList.get(i));
                        }
                    }
                    case 3 -> {
                        System.out.println("Sản phẩm có giá bán cao nhất là:");
                        float maxPrice = 0f;
                        for (ProductB3 product : productList) {
                            if (product.getPrice() > maxPrice) {
                                maxPrice = product.getPrice();
                            }
                        }
                        for (int i = 0; i < productList.size(); i++) {
                            if (productList.get(i).getPrice() == maxPrice) {
                                System.out.println("Hàng hoá thứ " + (i + 1) + " là:");
                                output(productList.get(i));
                            }
                        }
                    }
                    case 4 -> {
                        System.out.println("Sắp xếp theo thứ tự giảm dần của giá là:");
                        Collections.sort(productList, new ProductB3());
                        for (int i = 0; i < productList.size(); i++) {
                            System.out.println("Thông tin hàng hoá thứ " + (i + 1) + " là:");
                            output(productList.get(i));
                        }
                    }
                    case 5 -> {
                        boolean check = false;
                        for (ProductB3 product : productList) {
                            if (product.getNameProduct().contains("Sữa")) {
                                output(product);
                                check = true;
                            }
                        }
                        if (!check) {
                            System.out.println("Không tìm thấy mặt hàng sữa nào!");
                        }
                    }
                    case 6 -> System.out.println("Đã thoát chương trình!");
                    default -> System.out.println("Không có lựa chọn!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Lựa chọn phải là kiểu số nguyên.");
            }
        } while (choose != 6);
    }
}
