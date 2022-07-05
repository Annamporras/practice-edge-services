package com.ironhack.edgeservice.classes;


public class Price {

    private Long serialNumber;
    private String productName;
    private double price;

    public Price() {
    }

    public Price(Long serialNumber, String productName, double price) {
        this.serialNumber = serialNumber;
        this.productName = productName;
        this.price = price;
    }

    public Long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
