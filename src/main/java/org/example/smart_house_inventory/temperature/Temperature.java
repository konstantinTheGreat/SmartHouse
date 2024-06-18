package org.example.smart_house_inventory.temperature;

import org.example.smart_house_inventory.Device;

public interface Temperature extends Device {
    public void increaseTemp();
    public void decreaseTemp();

}
