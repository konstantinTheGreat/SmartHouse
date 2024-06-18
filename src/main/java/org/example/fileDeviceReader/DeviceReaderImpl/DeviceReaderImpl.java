package org.example.fileDeviceReader.DeviceReaderImpl;

import org.example.exception.TxtException;
import org.example.fileDeviceReader.DeviceReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DeviceReaderImpl implements DeviceReader {
    @Override
    public List<String> inventory(String txtFile) throws TxtException {
        List<String> inventory = new ArrayList<>();
        File inventoryList = new File(txtFile);

        try(BufferedReader reader = new BufferedReader(new FileReader(inventoryList))) {
            String line = reader.readLine();

            if (line != null) {
                int startIndex = 0;
                int endIndex = 0;
                while (startIndex < line.length() && endIndex < line.length()) {
                    if (line.charAt(endIndex) == ',') {
                        inventory.add(line.substring(startIndex, endIndex));
                        startIndex = endIndex + 1;
                    }
                    endIndex += 1;
                }
                inventory.add(line.substring(startIndex, endIndex));
            }
        } catch (IOException e) {
            throw new TxtException(e);
        }

        return inventory;
    }
}
