package com.ironhack.edgeservice.classes;




public class Inventory {


    private Long serialNumber;
    private int quantity;

    public Inventory() {
    }

    public Inventory(Long serialNumber, int quantity) {
        this.serialNumber = serialNumber;
        this.quantity = quantity;
    }

    public Long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
