package org.example.repository.SmartHouseRepositoryImpl;

import org.example.repository.SmartHouseRepository;
import org.example.smart_house_inventory.Device;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SmartHouseRepositoryImpl implements SmartHouseRepository {
    private final HashMap<Integer, Device> library;
    private int id = 0;

    public SmartHouseRepositoryImpl(){
        library = new HashMap<>();
    }

    @Override
    public Device findByID(int id) {
        return library.get(id);
    }

    @Override
    public HashMap<Integer, Device> getAllInventory() {
        return library;
    }

    @Override
    public void save(Device device) {
        id += 1;
        library.put(id, device);
    }

    @Override
    public void update(int id, Device device) {
        library.put(id, device);
    }

    @Override
    public void delete(int id) {
        library.remove(id);
    }
}
