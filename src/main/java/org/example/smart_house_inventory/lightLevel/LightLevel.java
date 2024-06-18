package org.example.smart_house_inventory.lightLevel;

import org.example.smart_house_inventory.Device;

public interface LightLevel extends Device {
    void increase();
    void decrease();

}
