package org.example.smart_house_inventory.temperature.temperatureImpl;

import org.example.smart_house_inventory.temperature.Temperature;
import org.example.state.State;

public class TemperatureAirImpl implements Temperature {
    private State state = State.change(this);
    private final org.example.smart_house_inventory.Temperature temperature = new org.example.smart_house_inventory.Temperature();

    public TemperatureAirImpl() {}

    @Override
    public void changeState() {
        this.state = State.change(this);
    }

    @Override
    public State getState() {
        return this.state;
    }

    public org.example.smart_house_inventory.Temperature getTemperature() {
        return temperature;
    }

    @Override
    public void increaseTemp() {
        this.temperature.increaseTemperature();
    }

    @Override
    public void decreaseTemp() {
        this.temperature.decreaseTemperature();
    }
}
