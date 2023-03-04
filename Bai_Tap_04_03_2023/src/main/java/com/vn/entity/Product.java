package com.vn.entity;

public class Product {
    private String maHH;
    private String tenHH;
    private Float soLuong;
    private Float gia1SP;

    public Product() {
    }

    public Product(String maHH, String tenHH, Float soLuong, Float gia1SP) {
        this.maHH = maHH;
        this.tenHH = tenHH;
        this.soLuong = soLuong;
        this.gia1SP = gia1SP;
    }

    public String getMaHH() {
        return maHH;
    }

    public void setMaHH(String maHH) {
        this.maHH = maHH;
    }

    public String getTenHH() {
        return tenHH;
    }

    public void setTenHH(String tenHH) {
        this.tenHH = tenHH;
    }

    public Float getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Float soLuong) {
        this.soLuong = soLuong;
    }

    public Float getGia1SP() {
        return gia1SP;
    }

    public void setGia1SP(Float gia1SP) {
        this.gia1SP = gia1SP;
    }

    @Override
    public String toString() {
        return "Product{" +
                "maHH='" + maHH + '\'' +
                ", tenHH='" + tenHH + '\'' +
                ", soLuong=" + soLuong +
                ", gia1SP=" + gia1SP +
                '}';
    }
}
