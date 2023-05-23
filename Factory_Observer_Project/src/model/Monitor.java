package model;

public class Monitor extends Electronics {
    private final Integer resolutionInPixels;
    private final Integer refreshRate;

    public Monitor(String brand, String model, Double price, Integer resolutionInPixels, Integer refreshRate) {
        super(brand, model, price);
        this.resolutionInPixels = resolutionInPixels;
        this.refreshRate = refreshRate;
    }

    public Integer getResolutionInPixels() {
        return resolutionInPixels;
    }

    public Integer getRefreshRate() {
        return refreshRate;
    }
}
