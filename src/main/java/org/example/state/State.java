package org.example.state;

import org.example.smart_house_inventory.Device;

public enum State {
    ON,
    OFF;

    public static State change(Device device){
        return stateChange(device);
    }

    private static State stateChange(Device device) {
        if(device.getState() == null || device.getState() == ON) {
            return OFF;
        } else {
            return ON;
        }
    }
}
