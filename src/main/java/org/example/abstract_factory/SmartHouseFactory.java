package org.example.abstract_factory;

import org.example.exception.TxtException;
import org.example.smart_house_inventory.Device;
import org.example.smart_house_inventory.curtain.curtainImpl.CurtainImpl;
import org.example.smart_house_inventory.lightLevel.lightLevelImpl.LightLevelImpl;
import org.example.smart_house_inventory.temperature.temperatureImpl.TemperatureAirImpl;
import org.example.smart_house_inventory.temperature.temperatureImpl.TemperatureFloorImpl;

import java.util.List;

public interface SmartHouseFactory {
    CurtainImpl createCurtain();
    LightLevelImpl createLight();
    TemperatureAirImpl createConditioner();
    TemperatureFloorImpl createTempFloor();
    List<Device> createDevice(List<String> devicesNames);
}
