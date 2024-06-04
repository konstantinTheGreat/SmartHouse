package org.example.smart_house_inventory.tempImpl;

import org.example.entity.Temperature;
import org.example.smart_house_inventory.Temp;
import org.example.state.State;

public class TempAirImpl implements Temp {
    private State state = State.change(this);
    private final Temperature temperature = new Temperature();

    public TempAirImpl() {}

    @Override
    public void changeState() {
        this.state = State.change(this);
    }

    @Override
    public State getState() {
        return this.state;
    }

    public Temperature getTemperature() {
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
