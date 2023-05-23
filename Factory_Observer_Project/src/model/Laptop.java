package model;

public class Laptop extends Electronics{
    private final String CPUModel;
    private final String GPUModel;

    public Laptop(String brand, String model, Double price, String CPUModel, String GPUModel) {
        super(brand, model, price);
        this.CPUModel=CPUModel;
        this.GPUModel=GPUModel;
    }

    public String getCPUModel() {
        return CPUModel;
    }

    public String getGPUModel() {
        return GPUModel;
    }
}
