package org.example.smart_house_inventory.temp.tempImpl;

import org.example.entity.Temperature;
import org.example.smart_house_inventory.temp.Temp;
import org.example.state.State;

public class TempFloorImpl implements Temp {
    private State state = State.change(this);
    private final Temperature temperature = new Temperature();

    public TempFloorImpl() {}

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
