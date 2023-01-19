package com.domain;

public class Brand implements Comparable<Brand> {
    private int brandId;
    private String brandName;
    private int count = 1;
    private boolean isExist = false;

    // constructor
    public Brand() {

    }

    public Brand(String brandName) {
        if (checkBrandName(brandName) == null) {
            this.brandName = brandName;
            setBrandId(count);
        } 
        // else {
            // we can not add an existed brandname to the treeset. but i wanted to print the
            // existence of brand.
            // System.out.println("Brand already exist. Can not add to the table.");
        // }
    }
    // method
    public Brand checkBrandName(String name) {
        for (Brand item : Product.brandSet) {
            isExist = item.getBrandName().equals(name);
            if (isExist == true) {
                setBrandName(item.getBrandName());
                setBrandId(item.getBrandId());
                return item;
            }
        }
        return null;
    }

    @Override
    public int compareTo(Brand other) {
        return this.brandName.compareTo(other.brandName);
    }

    @Override
    public String toString() {
        return "\nBrand [brandId=" + brandId + ", brandName=" + brandName + "]";
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int count) {
        this.brandId = count;
        this.count++;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

}
