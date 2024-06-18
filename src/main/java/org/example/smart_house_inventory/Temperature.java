package org.example.smart_house_inventory;

import java.util.Objects;

public class Temperature {
    private int temperature;

    public Temperature(int temperature) {
        this.temperature = temperature;
    }

    public Temperature() {
        temperature = 24; //default
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void increaseTemperature() {
        this.temperature += 1;
    }
    public void decreaseTemperature() {
        this.temperature -= 1;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Temperature that = (Temperature) o;
        return temperature == that.temperature;
    }

    @Override
    public int hashCode() {
        return Objects.hash(temperature);
    }

    @Override
    public String toString() {
        return "Temperature{" +
                "temperature=" + temperature +
                '}';
    }
}
