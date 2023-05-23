package model;

public class Smartphone extends Electronics {
    private final Integer batteryCapacityMilliAmps;
    private final Double diagonalSize;


    public Smartphone(String brand, String model, Double price, Integer batteryCapacityMilliAmps, Double diagonalSize) {
        super(brand, model, price);
        this.batteryCapacityMilliAmps = batteryCapacityMilliAmps;
        this.diagonalSize = diagonalSize;
    }

    public Integer getBatteryCapacityMilliAmps() {
        return batteryCapacityMilliAmps;
    }

    public Double getDiagonalSize() {
        return diagonalSize;
    }
}
