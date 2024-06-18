package org.example.state;

import org.example.smart_house_inventory.Device;

public enum State {
    ON,
    OFF;

    public static State change(Device device){
        return (device.getState() == null || device.getState() == ON) ? OFF : ON;
    }

}
