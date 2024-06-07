package org.example.repository;

import org.example.smart_house_inventory.Device;

import java.util.HashMap;
import java.util.List;

public interface SmartHouseRepository {
    Device findByID(int id);
    HashMap<Integer, Device> getAllInventory();
    void save(Device device);
    void update(int id, Device device);
    void delete(int id);
}
