package com.vn.entity;

import java.util.Comparator;

public class Product implements Comparator<Product> {
    private String idProduct;
    private String nameProduct;
    private Float amount;
    private Float price;

    public Product() {
    }

    public Product(String idProduct, String nameProduct, Float amount, Float price) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.amount = amount;
        this.price = price;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct='" + idProduct + '\'' +
                ", nameProduct='" + nameProduct + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                '}';
    }


    @Override
    public int compare(Product o1, Product o2) {
        return o2.getAmount().compareTo(o1.getAmount());
    }
}
