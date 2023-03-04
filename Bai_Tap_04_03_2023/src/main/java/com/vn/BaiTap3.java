package com.vn;

import com.vn.entity.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaiTap3 {
    private static Scanner scanner = new Scanner(System.in);

    public static Product InputSanPham() {
        Product product = new Product();
        System.out.print("Nhập mã sản phẩm: ");
        product.setMaHH(scanner.nextLine());
        System.out.print("Nhập tên sản phẩm: ");
        product.setTenHH(scanner.nextLine());
        System.out.print("Nhập số lượng: ");
        product.setSoLuong(NhapSoThucDuong());
        System.out.print("Nhập đơn giá: ");
        product.setGia1SP(NhapSoThucDuong());
        return product;
    }

    public static Integer NhapSoNguyenDuong() {
        Integer n = -1;
        do {
            try {
                n = Integer.parseInt(scanner.nextLine());
                if (n < 1) {
                    System.out.print("Số bạn nhập phải là số nguyên dương khác 0. Mời bạn nhập lại: ");
                }
            } catch (NumberFormatException exception) {
                System.out.print("Bạn nhập sai định dạng. Mời bạn nhập lại: ");
            }
        }
        while (n < 1);
        return n;
    }

    public static Float NhapSoThucDuong() {
        Float n = -1f;
        do {
            try {
                n = Float.parseFloat(scanner.nextLine());
                if (n < 1) {
                    System.out.print("Số bạn nhập phải là số thực dương khác 0. Mời bạn nhập lại: ");
                }
            } catch (NumberFormatException exception) {
                System.out.print("Bạn nhập sai định dạng. Mời bạn nhập lại: ");
            }
        }
        while (n < 1);
        return n;
    }

    public BaiTap3() {
        List<Product> productList = new ArrayList<>();
        System.out.print("Nhập số lượng sản phẩm cần lưu là: ");
        Integer n = NhapSoNguyenDuong();
        for (int i = 0; i < n; i++) {
            System.out.println("Thông tin sản phẩm thứ " + (i + 1) + " là:");
            productList.add(InputSanPham());
        }
        System.out.println("\nHiển thị danh sách sản phẩm:");
        productList.forEach(System.out::println);
        System.out.print("\nDanh sách sản phẩm có giá bán cao nhất là: ");
        Float[] maxGia = {0f};
        productList.forEach(item -> {
            if (maxGia[0] < item.getGia1SP()) {
                maxGia[0] = item.getGia1SP();
            }
        });
        productList.forEach(item -> {
            if (item.getGia1SP() == maxGia[0]) {
                System.out.println(item);
            }
        });
        System.out.println("\nSắp xếp sản phẩm theo giá giảm dần: ");
        productList.sort((product1, product2) -> product2.getGia1SP().compareTo(product1.getGia1SP()));
        productList.forEach(System.out::println);
        System.out.println("Danh sách sản phẩm 'Sữa' được tìm thấy là:");
        boolean check = true;
        for (Product product : productList) {
            if (product.getTenHH().toLowerCase().compareTo("sữa") == 0) {
                check = false;
                System.out.println(product);
            }
        }
        if (check) {
            System.out.println("Không có sản phẩm nào tên 'Sữa' được tìm thấy.");
        }
    }
}
