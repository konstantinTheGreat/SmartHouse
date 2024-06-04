package org.example.smart_house_inventory;

import org.example.state.State;

public interface Device {
    public void changeState();

    public State getState();
}
