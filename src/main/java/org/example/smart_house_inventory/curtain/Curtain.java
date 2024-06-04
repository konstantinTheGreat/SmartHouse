package org.example.smart_house_inventory.curtain;

import org.example.smart_house_inventory.Device;

public interface Curtain extends Device {
    public void close();
    public void open();
}
