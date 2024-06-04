package org.example.abstract_factory;

import exception.TxtException;
import org.example.smart_house_inventory.Device;
import org.example.smart_house_inventory.curtain.curtainImpl.CurtainImpl;
import org.example.smart_house_inventory.lightLevel.lightLevelImpl.LightLevelImpl;
import org.example.smart_house_inventory.temp.tempImpl.TempAirImpl;
import org.example.smart_house_inventory.temp.tempImpl.TempFloorImpl;

public interface SmartHouseFactory {
    CurtainImpl createCurtain();
    LightLevelImpl createLight();
    TempAirImpl createConditioner();
    TempFloorImpl createTempFloor();
    Device createDevice(String fileTxt) throws TxtException;
}
