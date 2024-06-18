package org.example.smart_house_inventory.curtain;

import org.example.smart_house_inventory.Device;

public interface Curtain extends Device {
    void close();
    void open();
}
