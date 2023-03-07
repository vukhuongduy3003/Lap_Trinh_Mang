package com.vn;

import com.vn.entity.HangThucPham;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Scanner;

public class Bai_6 {
    private Scanner scanner = new Scanner(System.in);
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT);


    public String inputStringNotNull() {
        String s;
        do {
            s = scanner.nextLine();
            if (s.isEmpty()) {
                System.out.print("Không được để rỗng! Mời bạn nhập lại: ");
            }
        } while (s.isEmpty());
        return s;
    }

    public Float InputFloatPositive() {
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

    public LocalDate inputDate() {
        while (true) {
            try {
                LocalDate date = LocalDate.parse(scanner.nextLine(), formatter);
                return date;
            } catch (DateTimeParseException e) {
                System.out.print("Bạn nhập sai định dạng dd/MM/yyyy hoặc ngày bạn nhập không tồn tại. Mời bạn nhập lại: ");
            }
        }
    }

    public LocalDate inputDateExpiration(LocalDate dateOfManufacture) {
        LocalDate date = inputDate();
        while (dateOfManufacture.isAfter(date)) {
            System.out.print("Ngày hết hạn phải sau ngày sản xuất! Mời bạn nhập lại: ");
            date = inputDate();
        }
        return date;
    }

    public Bai_6() {
        System.out.print("Nhập mã hàng: ");
        HangThucPham hangThucPham = new HangThucPham(inputStringNotNull());
        System.out.print("Nhập tên hàng: ");
        hangThucPham.setTenHang(inputStringNotNull());
        System.out.print("Nhập đơn giá: ");
        hangThucPham.setDonGia(InputFloatPositive());
        System.out.print("Nhập ngày sản xuất(Định dạng dd/MM/yyyy): ");
        hangThucPham.setNgaySanXuat(inputDate());
        System.out.print("Nhập ngày hết hạn(Định dạng dd/MM/yyyy): ");
        hangThucPham.setNgayHetHan(inputDateExpiration(hangThucPham.getNgaySanXuat()));

        System.out.println(hangThucPham);
        System.out.println(hangThucPham.checkDateExpiration() ? "Hàng thực phẩm này đã hết hạn" : "Hàng thực phẩm này chưa hết hạn");
    }
}
