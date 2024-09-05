package main.java.com.wora;

import java.math.BigDecimal;

public class Bike extends Vehicle {
    private Boolean isAnyTerrain;

    public Bike(String brand, String model, String year, BigDecimal basePrice, Boolean isAnyTerrain) {
        super(brand, model, year, basePrice);
        this.isAnyTerrain = isAnyTerrain;
    }

    @Override
    protected BigDecimal calculateLocationPrice(Integer days) {
        return isAnyTerrain ?
                basePrice
                        .multiply(new BigDecimal("0.2"))
                        .add(basePrice)
                        .multiply(new BigDecimal(days))
                : basePrice.multiply(new BigDecimal(days));
    }

    public Boolean getAnyTerrain() {
        return isAnyTerrain;
    }

    public Bike setAnyTerrain(Boolean anyTerrain) {
        this.isAnyTerrain = anyTerrain;
        return this;
    }

    @Override
    protected void displayVehicleType() {
        System.out.println("Bike");
    }

    @Override
    protected String getDescription() {
        return "Bike{" +
                "isAnyTerrain=" + isAnyTerrain +
                ", brand='" + brand + "' \n" +
                ", model='" + model + "' \n" +
                ", year='" + year + "' \n" +
                ", basePrice=" + basePrice + "'\n" +
                '}';
    }
}
