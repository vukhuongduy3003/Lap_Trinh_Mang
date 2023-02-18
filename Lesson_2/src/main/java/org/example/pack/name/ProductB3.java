package org.example.pack.name;

import java.util.Comparator;

public class ProductB3 implements Comparator<ProductB3> {
    private String idProduct;
    private String nameProduct;
    private Float amount;
    private Float price;

    public ProductB3() {
    }

    public ProductB3(String idProduct, String nameProduct, Float amount, Float price) {
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
        return "ProductB3{" +
                "idProduct='" + idProduct + '\'' +
                ", nameProduct='" + nameProduct + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                '}';
    }

    @Override
    public int compare(ProductB3 o1, ProductB3 o2) {
        return o2.getPrice().compareTo(o1.getPrice());
    }
}
