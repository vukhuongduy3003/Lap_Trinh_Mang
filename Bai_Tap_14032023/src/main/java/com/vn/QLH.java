package com.vn;

import java.util.Scanner;

public class QLH {
    private String maHang;
    private String tenHang;
    private String xuatXu;
    private Integer loaiHang;
    private Integer soLuong;

    public String getTenHang() {
        return tenHang;
    }

    Scanner scanner = new Scanner(System.in);

    public void input() {
        System.out.print("(+)Nhập mã hàng: ");
        this.maHang = scanner.nextLine();
        System.out.print("(+)Nhập tên hàng: ");
        this.tenHang = scanner.nextLine();
        System.out.print("(+)Nhập xuất xứ: ");
        this.xuatXu = scanner.nextLine();
        System.out.print("(+)Nhập loại hàng: ");
        do {
            this.loaiHang = Program.NhapSoNguyenDuong();
            if (this.loaiHang < 1 || this.loaiHang > 3) {
                System.out.print("Loại hàng chỉ có loại 1, 2, 3. Mời bạn nhập lại: ");
            }
        } while (this.loaiHang < 1 || this.loaiHang > 3);
        System.out.print("(+)Nhập số lượng: ");
        this.soLuong = Program.NhapSoNguyenDuong();
    }

    public void output() {
        System.out.printf("%-30s %-30s %-30s %-30s %-30s ", this.maHang, this.tenHang, this.xuatXu, this.loaiHang, this.soLuong);
    }
}
