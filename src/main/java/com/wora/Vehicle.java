package main.java.com.wora;

import java.math.BigDecimal;

abstract class Vehicle {
    protected String brand;
    protected String model;
    protected String year;
    protected BigDecimal basePrice;

    public Vehicle(String brand, String model, String year, BigDecimal basePrice) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.basePrice = basePrice;
    }

    public String getBrand() {
        return brand;
    }

    public Vehicle setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public String getModel() {
        return model;
    }

    public Vehicle setModel(String model) {
        this.model = model;
        return this;
    }

    public String getYear() {
        return year;
    }

    public Vehicle setYear(String year) {
        this.year = year;
        return this;
    }

    public BigDecimal getBasePrice() {
        return basePrice;
    }

    public Vehicle setBasePrice(BigDecimal basePrice) {
        this.basePrice = basePrice;
        return this;
    }

    protected abstract BigDecimal calculateLocationPrice(Integer days);

    protected abstract void displayVehicleType();

    protected abstract String getDescription();
}
