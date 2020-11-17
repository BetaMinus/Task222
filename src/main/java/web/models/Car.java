package web.models;

public class Car {
    private String model;
    private String color;
    private long series;

    public Car() {
    }

    public Car(String model, String color, long series) {
        this.model = model;
        this.color = color;
        this.series = series;
    }

    public String getModel() {
        return model;
    }
    public String getColor() { return color; }
    public long getSeries() { return series; }

}
