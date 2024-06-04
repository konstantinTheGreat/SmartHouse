package org.example.abstract_factory;

import org.example.smart_house_inventory.Curtain;
import org.example.smart_house_inventory.curtainImpl.CurtainImpl;
import org.example.smart_house_inventory.lightLevelImpl.LightLevelImpl;
import org.example.smart_house_inventory.tempImpl.TempAirImpl;
import org.example.smart_house_inventory.tempImpl.TempFloorImpl;

public interface InventoryFactory {
    CurtainImpl createCurtain();
    LightLevelImpl createLight();
    TempAirImpl createConditioner();
    TempFloorImpl createTempFloor();
}
