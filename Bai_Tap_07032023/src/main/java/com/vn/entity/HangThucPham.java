package com.vn.entity;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HangThucPham {
    private final String maHang;
    private String tenHang;
    private Float donGia;
    private LocalDate ngaySanXuat;
    private LocalDate ngayHetHan;

    public HangThucPham(String maHang) {
        this.maHang = maHang;
    }

    public HangThucPham(String maHang, String tenHang, Float donGia, LocalDate ngaySanXuat, LocalDate ngayHetHan) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
    }

    public String getMaHang() {
        return maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public Float getDonGia() {
        return donGia;
    }

    public void setDonGia(Float donGia) {
        this.donGia = donGia;
    }

    public LocalDate getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(LocalDate ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public LocalDate getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(LocalDate ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }

    public boolean checkDateExpiration() {
        // Lấy ngày giờ hiện tại
        LocalDate now = LocalDate.now();
        // Định dạng ngày giờ
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return this.ngayHetHan.isBefore(now);
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "HangThucPham{" +
                "maHang=" + maHang +
                ", tenHang='" + tenHang + '\'' +
                ", donGia=" + new DecimalFormat("#,###.##").format(donGia) +
                ", ngaySanXuat=" + ngaySanXuat.format(formatter) +
                ", ngayHetHan=" + ngayHetHan.format(formatter) +
                '}';
    }
}
