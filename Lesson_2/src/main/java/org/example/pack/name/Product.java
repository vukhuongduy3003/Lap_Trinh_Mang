package org.example.pack.name;

public class Product  implements Comparable<Product> {
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
    public int compareTo(Product o) {
        if (this.getPrice() < o.getPrice()) {
            return 1;
        }
        return 0;
    }
}
