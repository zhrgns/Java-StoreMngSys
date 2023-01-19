package com.domain;

import java.util.Set;
import java.util.TreeSet;

public class Product implements Comparable<Product> {
    private String productName;
    private int productId;
    private static int count = 1;
    private int price;
    private Brand productBrand;

    public static Set<Brand> brandSet = new TreeSet<>();

    // static block
    static {
        brandSet.add(new Brand("Samsung"));
        brandSet.add(new Brand("Lenovo"));
        brandSet.add(new Brand("Apple"));
        brandSet.add(new Brand("Huawei"));
        brandSet.add(new Brand("Casper"));
        brandSet.add(new Brand("Asus"));
        brandSet.add(new Brand("HP"));
        brandSet.add(new Brand("Xiaomi"));
        brandSet.add(new Brand("Monster"));
    }
    // constructors

    public Product() {
    }

    public Product(String productName, int price, Brand productBrand) {
        this.setProductId(count);
        this.productName = productName;
        this.price = price;
        this.productBrand = productBrand;
        count++;
    }

    // method
    @Override
    public int compareTo(Product other) {
        return this.productName.compareTo(other.productName);
    }

    // getter setter
    public int getProductId() {
        return productId;
    }

    public void setProductId(int count) {
        this.productId = count;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getprice() {
        return price;
    }

    public void setprice(int price) {
        this.price = price;
    }

    public Brand getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(Brand productBrand) {
        this.productBrand = productBrand;
    }

    public static Set<Brand> getBrandSet() {
        return brandSet;
    }

    public static void setBrandSet(Set<Brand> brandSet) {
        Product.brandSet = brandSet;
    }

}
