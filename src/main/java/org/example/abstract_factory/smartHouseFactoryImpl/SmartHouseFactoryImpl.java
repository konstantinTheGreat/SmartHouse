package org.example.abstract_factory.inventoryFactoryImpl;

import org.example.abstract_factory.SmartHouseFactory;
import org.example.smart_house_inventory.curtainImpl.CurtainImpl;
import org.example.smart_house_inventory.lightLevelImpl.LightLevelImpl;
import org.example.smart_house_inventory.tempImpl.TempAirImpl;
import org.example.smart_house_inventory.tempImpl.TempFloorImpl;

public class SmartHouseFactoryImpl implements SmartHouseFactory {

    @Override
    public CurtainImpl createCurtain() {
        return new CurtainImpl();
    }

    @Override
    public LightLevelImpl createLight() {
        return new LightLevelImpl();
    }

    @Override
    public TempAirImpl createConditioner() {
        return new TempAirImpl();
    }

    @Override
    public TempFloorImpl createTempFloor() {
        return new TempFloorImpl();
    }
}
