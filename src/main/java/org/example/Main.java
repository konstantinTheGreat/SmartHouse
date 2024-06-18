package org.example;

import org.example.abstract_factory.SmartHouseFactory;
import org.example.abstract_factory.smartHouseFactoryImpl.SmartHouseFactoryImpl;
import org.example.exception.TxtException;
import org.example.fileDeviceReader.DeviceReader;
import org.example.fileDeviceReader.DeviceReaderImpl.DeviceReaderImpl;
import org.example.smart_house_inventory.Device;

import java.util.List;

import static org.example.constants.Constants.PATH_TO_TXT;


public class Main {
    public static void main(String[] args) throws TxtException {
        SmartHouseFactory factory = new SmartHouseFactoryImpl();
        String file = PATH_TO_TXT;
        DeviceReader reader = new DeviceReaderImpl();
        reader.inventory(file);
        List<Device> devices = factory.createDevice(reader.inventory(file));
        Device device = devices.get(0);

        System.out.println(device.toString());
        System.out.println(device.getState());
        device.changeState();
        System.out.println(device.getState());

    }
}