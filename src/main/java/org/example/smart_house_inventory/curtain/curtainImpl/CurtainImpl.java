package org.example.smart_house_inventory.curtainImpl;

import org.example.smart_house_inventory.Curtain;
import org.example.state.State;

public class CurtainImpl implements Curtain {
    private State state = State.change(this);;
    private int curtainRange;

    public CurtainImpl() {
    }

    @Override
    public void close() {
        if (curtainRange == 0) {
            System.out.println("Curtains are closed completely");
        }
        this.curtainRange += 25;
    }

    @Override
    public void open() {
        if (curtainRange == 100) {
            System.out.println("Curtains are opened completely");
        }
    }

    @Override
    public void changeState() {
        this.state = State.change(this);
    }

    @Override
    public State getState() {
        return this.state;
    }
}
