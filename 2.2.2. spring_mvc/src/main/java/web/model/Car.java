package web.model;

public class Car {
    private String model;
    private int series;
    private byte age;

    public Car() {
    }

    public Car(String model, int series, byte age) {
        this.model = model;
        this.series = series;
        this.age = age;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }
}
