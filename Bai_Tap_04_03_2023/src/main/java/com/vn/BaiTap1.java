package com.vn;

import com.vn.entity.SanPham;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaiTap1 {
    private static Scanner scanner = new Scanner(System.in);

    public static SanPham InputSanPham() {
        SanPham sanPham = new SanPham();
        System.out.print("Nhập mã sản phẩm: ");
        sanPham.setId(NhapSoNguyenDuong());
        System.out.print("Nhập tên sản phẩm: ");
        sanPham.setName(scanner.nextLine());
        System.out.print("Nhập số lượng: ");
        sanPham.setQuantity(NhapSoNguyenDuong());
        System.out.print("Nhập đơn giá: ");
        sanPham.setPrice(NhapSoNguyenDuong());
        return sanPham;
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

    public BaiTap1() {
        List<SanPham> sanPhamList = new ArrayList<>();
        System.out.print("Nhập số lượng sản phẩm cần lưu là: ");
        Integer n = NhapSoNguyenDuong();
        for (int i = 0; i < n; i++) {
            System.out.println("Thông tin sản phẩm thứ " + (i + 1) + " là:");
            sanPhamList.add(InputSanPham());
        }
        System.out.println("\nHiển thị danh sách sản phẩm:");
        sanPhamList.forEach(System.out::println);
        System.out.print("\nNhập tên sản phẩm cần tìm: ");
        String s = scanner.nextLine();
        System.out.println("Danh sách sản phẩm được tìm thấy là:");
        sanPhamList.forEach(item -> {
            if (item.getName().toLowerCase().compareTo(s.toLowerCase()) == 0) {
                System.out.println(item);
            }
        });
        System.out.println("\nSắp xếp sản phẩm theo giá giảm dần: ");
        sanPhamList.sort((sanPham1, sanPham2) -> sanPham2.getPrice().compareTo(sanPham1.getPrice()));
        sanPhamList.forEach(System.out::println);
    }
}
