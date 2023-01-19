package com.domain;

public class Notebook extends Product {
    private int storageSize;
    private double screenSize;
    private int ram;

    // constructor
    public Notebook() {

    }

    public Notebook(int storageSize, double screenSize, int ram) {
        this.storageSize = storageSize;
        this.screenSize = screenSize;
        this.ram = ram;
    }

    public Notebook(String productName, int price, Brand productBrand, int storageSize, double screenSize, int ram) {
        super(productName, price, productBrand);
        this.storageSize = storageSize;
        this.screenSize = screenSize;
        this.ram = ram;
    }

    // composition with product class
    public Notebook(Product product, int storageSize, double screenSize, int ram) {
        super();
        this.storageSize = storageSize;
        this.screenSize = screenSize;
        this.ram = ram;
    }

    // method

    @Override
    public String toString() {
        return "\t" + this.getProductId() + "\t" + this.getProductName() + "\t" + this.getprice() + "  "
                + this.getProductBrand().getBrandName() + "\t" + this.getStorageSize() + "\t\t" + this.getScreenSize()
                + "\t\t" + this.getRam();
    }

    // getter setter
    public int getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(int storageSize) {
        this.storageSize = storageSize;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

}
