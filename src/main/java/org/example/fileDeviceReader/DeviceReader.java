package org.example.fileDeviceReader;

import org.example.exception.TxtException;

import java.util.List;

public interface DeviceReader {
    public List<String> inventory(String txtFile) throws TxtException;
}
