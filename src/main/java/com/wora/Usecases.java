package main.java.com.wora;

import java.math.BigDecimal;
import java.util.List;

public class Usecases {
    private final List<Vehicle> vehicles;

    public Usecases() {
        this.vehicles = List.of(
                new Car("audi", "model", "2024", BigDecimal.valueOf(30), 5, false),
                new Bike("kawasaki", "ninja H2", "2024", BigDecimal.valueOf(300), false),
                new Truck("scania", "big scania", "2017", BigDecimal.valueOf(4000), 60)
        );
    }

    public void invokeDisplayType() {
        vehicles.forEach(Vehicle::displayVehicleType);
    }

    public void invokeCalculateLocationPrice() {
        vehicles.stream()
                .map(vehicle -> vehicle.calculateLocationPrice(5))
                .forEach(System.out::println);
    }

    public void invokeGetDescription() {
        vehicles.forEach(Vehicle::getDescription);
    }

    public void checkClassType() {
        vehicles.stream()
                .map(Vehicle::getClass)
                .map(Class::getSimpleName)
                .forEach(System.out::println);
    }
}
