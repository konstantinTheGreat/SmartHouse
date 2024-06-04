package org.example.abstract_factory.smartHouseFactoryImpl;

import exception.TxtException;
import org.example.abstract_factory.SmartHouseFactory;
import org.example.fileDeviceReader.DeviceReader;
import org.example.fileDeviceReader.DeviceReaderImpl.DeviceReaderImpl;
import org.example.smart_house_inventory.Device;
import org.example.smart_house_inventory.curtain.curtainImpl.CurtainImpl;
import org.example.smart_house_inventory.lightLevel.lightLevelImpl.LightLevelImpl;
import org.example.smart_house_inventory.temp.tempImpl.TempAirImpl;
import org.example.smart_house_inventory.temp.tempImpl.TempFloorImpl;

import java.util.List;

public class SmartHouseFactoryImpl implements SmartHouseFactory {
    private List<String> inventory;
    private final DeviceReader deviceReader = new DeviceReaderImpl();
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

    @Override
    public Device createDevice(String fileTxt) throws TxtException {
        this.inventory = this.deviceReader.inventory(fileTxt);
        String device = inventory.get(0);
        inventory.remove(0);
        return switch (device) {
            case "curtain" -> createCurtain();
            case "floorHeat" -> createTempFloor();
            case "conditioner" -> createConditioner();
            case "lightLevel" -> createLight();
            default -> null;
        };
    }
}
