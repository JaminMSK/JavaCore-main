package Lesson4.garage;

import org.jetbrains.annotations.NotNull;

public class Vehicle implements Comparable <Vehicle>  {
    private  String model;
    private int power;

    public Vehicle(String model, int power) {
        this.model = model;
        this.power = power;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", power=" + power +
                '}';
    }

    @Override
    public int compareTo(@NotNull Vehicle o) {
        return power - o.getPower();
    }
}
