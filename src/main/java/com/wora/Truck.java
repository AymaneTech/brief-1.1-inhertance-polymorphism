package main.java.com.wora;

import java.math.BigDecimal;

class Truck extends Vehicle {
    private Integer maxCapacity;

    public Truck(String brand, String model, String year, BigDecimal basePrice, Integer maxCapacity) {
        super(brand, model, year, basePrice);
        this.maxCapacity = maxCapacity;
    }

    @Override
    protected BigDecimal calculateLocationPrice(Integer days) {
        return maxCapacity >= 10 ?
                basePrice
                        .multiply(new BigDecimal("0.3"))
                        .add(basePrice)
                        .multiply(new BigDecimal(days))
                : basePrice.multiply(new BigDecimal(days));
    }

    public Integer getMaxCapacity() {
        return maxCapacity;
    }

    public Truck setMaxCapacity(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
        return this;
    }

    @Override
    protected void displayVehicleType() {
        System.out.println("Truck");
    }

    @Override
    public String getDescription() {
        return "Truck{" +
                "brand='" + brand + "'\n" +
                ", model='" + model + "'\n" +
                ", year='" + year + "'\n" +
                ", basePrice=" + basePrice + "\n" +
                '}';
    }
}
