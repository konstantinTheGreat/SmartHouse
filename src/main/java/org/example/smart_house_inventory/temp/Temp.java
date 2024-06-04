package org.example.smart_house_inventory.temp;

import org.example.smart_house_inventory.Device;

public interface Temp extends Device {
    public void increaseTemp();
    public void decreaseTemp();

}
