package com.vn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 */
public class Program {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhập số lượng mặt hàng: ");
        Integer n = NhapSoNguyenDuong();
        List<MayTinh> mayTinhList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Thông tin của mặt hàng thứ " + (i + 1) + " là:");
            MayTinh mayTinh = new MayTinh();
            mayTinh.input();
            mayTinhList.add(mayTinh);
        }
        System.out.println("Hiển thị danh sách:");
        System.out.printf("%-30s %-30s %-30s %-30s %-30s %-30s\n", "Mã hàng", "Tên hàng", "Xuất xứ", "Loại hàng", "Số lượng", "Thời gian bh");
        mayTinhList.forEach(mayTinh -> {mayTinh.output();});

        System.out.println("Hiển thị danh sách loại hàng có thời gian bảo hành từ tháng 12 trở lên:");
        System.out.printf("%-30s %-30s %-30s %-30s %-30s %-30s\n", "Mã hàng", "Tên hàng", "Xuất xứ", "Loại hàng", "Số lượng", "Thời gian bh");
        mayTinhList.forEach(mayTinh -> {
            if (mayTinh.getTgbh() >= 12) {
                mayTinh.output();
            }
        });

        System.out.print("Nhập tên mặt hàng cần tìm kiếm: ");
        String s = scanner.nextLine();
        System.out.println("Hiển thị danh sách loại hàng được tìm thấy:");
        System.out.printf("%-30s %-30s %-30s %-30s %-30s %-30s\n", "Mã hàng", "Tên hàng", "Xuất xứ", "Loại hàng", "Số lượng", "Thời gian bh");
        mayTinhList.forEach(mayTinh -> {
            if (mayTinh.getTenHang().toLowerCase().equals(s.toLowerCase())) {
                mayTinh.output();
            }
        });
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
}
