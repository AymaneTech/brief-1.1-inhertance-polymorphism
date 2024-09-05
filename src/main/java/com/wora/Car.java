package main.java.com.wora;

import java.math.BigDecimal;

class Car extends Vehicle {
    private Integer numberOfDoors;
    private Boolean isAutomatic;

    public Car(String brand, String model, String year, BigDecimal basePrice, Integer numberOfDoors, Boolean isAutomatic) {
        super(brand, model, year, basePrice);
        this.numberOfDoors = numberOfDoors;
        this.isAutomatic = isAutomatic;
    }

    public Integer getNumberOfDoors() {
        return numberOfDoors;
    }

    public Car setNumberOfDoors(Integer numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
        return this;
    }

    public Boolean getAutomatic() {
        return isAutomatic;
    }

    public Car setAutomatic(Boolean automatic) {
        isAutomatic = automatic;
        return this;
    }

    @Override
    protected BigDecimal calculateLocationPrice(Integer days) {
        return isAutomatic ?
                basePrice
                        .multiply(new BigDecimal("0.1"))
                        .add(new BigDecimal("0.05"))
                        .multiply(new BigDecimal(days))
                : basePrice.multiply(new BigDecimal(days));
    }

    @Override
    protected void displayVehicleType() {
        System.out.println("Car");
    }

    @Override
    protected String getDescription() {
        return "Car{" +
                "numberOfDoors='" + numberOfDoors + '\'' +
                ", isAutomatic=" + isAutomatic +
                ", brand='" + brand + "' \n" +
                ", model='" + model + "' \n" +
                ", year='" + year + "' \n" +
                ", basePrice=" + basePrice + "'\n" +
                '}';
    }
}
