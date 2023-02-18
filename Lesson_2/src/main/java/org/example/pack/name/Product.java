package org.example.pack.name;

import java.util.Comparator;

public class Product  implements Comparator<Product> {
    private String nameProduct;
    private String company;
    private Integer price;

    public Product() {
    }

    public Product(String nameProduct, String company, Integer price) {
        this.nameProduct = nameProduct;
        this.company = company;
        this.price = price;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nameProduct='" + nameProduct + '\'' +
                ", company='" + company + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compare(Product o1, Product o2) {
        return o2.getPrice().compareTo(o1.getPrice());
    }
}
