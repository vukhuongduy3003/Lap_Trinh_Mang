package com.vn.entity;

public class Vehicle {
    private Integer maXe;
    private String tenXe;
    private String chuXe;
    private Integer giaXe;
    private Integer dungTich;

    public Vehicle() {
    }

    public Vehicle(Integer maXe, String tenXe, String chuXe, Integer giaXe, Integer dungTich) {
        this.maXe = maXe;
        this.tenXe = tenXe;
        this.chuXe = chuXe;
        this.giaXe = giaXe;
        this.dungTich = dungTich;
    }

    public Integer getMaXe() {
        return maXe;
    }

    public void setMaXe(Integer maXe) {
        this.maXe = maXe;
    }

    public String getTenXe() {
        return tenXe;
    }

    public void setTenXe(String tenXe) {
        this.tenXe = tenXe;
    }

    public String getChuXe() {
        return chuXe;
    }

    public void setChuXe(String chuXe) {
        this.chuXe = chuXe;
    }

    public Integer getGiaXe() {
        return giaXe;
    }

    public void setGiaXe(Integer giaXe) {
        this.giaXe = giaXe;
    }

    public Integer getDungTich() {
        return dungTich;
    }

    public void setDungTich(Integer dungTich) {
        this.dungTich = dungTich;
    }

    public Float tinhMucThue(Integer dungTich, Integer giaXe) {
        if (dungTich < 100) {
            return giaXe * 0.01f;
        } else if (dungTich <= 200) {
            return giaXe * 0.03f;
        } else {
            return giaXe * 0.05f;
        }
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "maXe=" + maXe +
                ", tenXe='" + tenXe + '\'' +
                ", chuXe='" + chuXe + '\'' +
                ", giaXe=" + giaXe +
                ", dungTich=" + dungTich +
                ", mucThue=" + tinhMucThue(dungTich, giaXe) +
                '}';
    }
}
