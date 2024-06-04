package org.example.smart_house_inventory.lightLevel.lightLevelImpl;

import org.example.smart_house_inventory.lightLevel.LightLevel;
import org.example.state.State;

public class LightLevelImpl implements LightLevel {
    private State state = State.change(this);
    private int LightLevel;

    public LightLevelImpl() {
    }

    @Override
    public void increase() {
        if (this.LightLevel == 100) {
            System.out.println("Max light level reached");
            return;
        }
        this.LightLevel += 1;
    }

    @Override
    public void decrease() {
        if (this.LightLevel == 0) {
            System.out.println("Min light level reached");
            return;
        }
        this.LightLevel -= 1;
    }



    @Override
    public void changeState() {
        this.state = State.change(this);
    }

    @Override
    public State getState() {
        return state;
    }

}
