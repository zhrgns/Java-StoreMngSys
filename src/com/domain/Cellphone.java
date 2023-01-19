package com.domain;

public class Cellphone extends Product {
    private int storageSize;
    private double screenSize;
    private int batteryPower;
    private int ram;
    private String color;

    // constructor
    public Cellphone() {
    }

    public Cellphone(String productName, int price, Brand productBrand, int storageSize, double screenSize,
            int batteryPower, int ram, String color) {
        super(productName, price, productBrand);
        this.storageSize = storageSize;
        this.screenSize = screenSize;
        this.batteryPower = batteryPower;
        this.ram = ram;
        this.color = color;
    }
    
    // getter setter
    public int getStorageSize() {
        return storageSize;
    }

    @Override
    public String toString() {
        return "\t" + this.getProductId() + "\t" + this.getProductName() + "\t" + this.getprice() + "  "
                + this.getProductBrand().getBrandName() + "\t"
                + this.getStorageSize() + "\t\t" + this.getScreenSize() + "\t\t" + this.getBatteryPower()
                + "\t   " + this.getRam() + "\t" + this.getColor();
    }

    public void setStorageSize(int storageSize) {
        this.storageSize = storageSize;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(int batteryPower) {
        this.batteryPower = batteryPower;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
