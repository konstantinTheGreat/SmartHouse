package org.example.abstract_factory.smartHouseFactoryImpl;

import org.example.exception.TxtException;
import org.example.abstract_factory.SmartHouseFactory;
import org.example.fileDeviceReader.DeviceReader;
import org.example.fileDeviceReader.DeviceReaderImpl.DeviceReaderImpl;
import org.example.smart_house_inventory.Device;
import org.example.smart_house_inventory.curtain.curtainImpl.CurtainImpl;
import org.example.smart_house_inventory.lightLevel.lightLevelImpl.LightLevelImpl;
import org.example.smart_house_inventory.temperature.temperatureImpl.TemperatureAirImpl;
import org.example.smart_house_inventory.temperature.temperatureImpl.TemperatureFloorImpl;

import java.util.ArrayList;
import java.util.List;

public class SmartHouseFactoryImpl implements SmartHouseFactory {
    private List<String> inventory;
    private final DeviceReader deviceReader = new DeviceReaderImpl(); // create in main
    @Override
    public CurtainImpl createCurtain() {
        return new CurtainImpl();
    }

    @Override
    public LightLevelImpl createLight() {
        return new LightLevelImpl();
    }

    @Override
    public TemperatureAirImpl createConditioner() {
        return new TemperatureAirImpl();
    }

    @Override
    public TemperatureFloorImpl createTempFloor() {
        return new TemperatureFloorImpl();
    }

    @Override
    public List<Device> createDevice(List<String> devicesNames) {

        List<Device> devices = new ArrayList<>();

        for (String devicesName : devicesNames) {
            Device device = null;
            switch (devicesName) {
                case "curtain" -> device = createCurtain();
                case "floorHear" -> device = createTempFloor();
                case "conditioner" -> device = createConditioner();
                case "lightLevel" -> device = createLight();
            }
            if (device != null) {
                devices.add(device);
            }
        }

        return devices;
    }
}
