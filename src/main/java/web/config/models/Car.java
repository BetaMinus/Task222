package web.config.models;

public class Car {
    private String model;
    private String color;
    private long series;

    public Car() { }

    public Car(String model, String color, long series) {
        this.model = model;
        this.color = color;
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return model + " " + color + " " + series;
    }
}
