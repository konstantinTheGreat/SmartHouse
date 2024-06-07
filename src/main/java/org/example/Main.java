package org.example;

import org.example.abstract_factory.SmartHouseFactory;
import org.example.abstract_factory.smartHouseFactoryImpl.SmartHouseFactoryImpl;
import org.example.exception.TxtException;
import org.example.fileDeviceReader.DeviceReader;
import org.example.fileDeviceReader.DeviceReaderImpl.DeviceReaderImpl;
import org.example.smart_house_inventory.Device;


public class Main {
    public static void main(String[] args) throws TxtException {
        SmartHouseFactory factory = new SmartHouseFactoryImpl();
        String file = "/Users/user/Desktop/java4thsem/Smart House/src/main/resources/txt";
        DeviceReader reader = new DeviceReaderImpl();

        Device device = factory.createDevice(file);

        System.out.println(device.getState());


        device.changeState();

        System.out.println(device.getState());
    }
}