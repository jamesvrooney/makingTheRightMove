package com.rooney.james;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by jamesvrooney on 31/12/2017.
 */
public class PropertyFileParser {
    private final String COMMA_SEPARATOR = ",";

    public List<PropertyRecord> readPropertyFile(String file) throws FileNotFoundException {
        BufferedReader br = new BufferedReader(openFile(file));

        List<PropertyRecord> propertyRecords = new ArrayList<>();

        try {
            br.readLine();

            propertyRecords = br.lines()
                    .map(convertPropertyRecordStringToObject)
                    .collect(Collectors.toList());

            propertyRecords.removeAll(Collections.singleton(null));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return propertyRecords;
    }

    private Function<String, PropertyRecord> convertPropertyRecordStringToObject = line -> {
        String[] propertyData = line.split(COMMA_SEPARATOR);

        long propertyReference;
        int price;
        int numBedrooms;
        int numBathrooms;
        String houseNumber;
        String address;
        String region;
        Postcode postcode;
        PropertyType propertyType;

        PropertyRecord propertyRecord = null;

        try {
            propertyReference = Long.parseLong(propertyData[0]);
            price = Integer.parseInt(propertyData[1]);
            numBedrooms = Integer.parseInt(propertyData[2]);
            numBathrooms = Integer.parseInt(propertyData[3]);;
            houseNumber = propertyData[4];
            address  = propertyData[5];
            region = propertyData[6];

            postcode = new Postcode(propertyData[7]);
            propertyType = PropertyType.valueOf(propertyData[8].toUpperCase());

            propertyRecord = new PropertyRecord(propertyReference, price, numBedrooms, numBathrooms, houseNumber, address, region, postcode, propertyType);

        } catch (Exception e) {
            System.out.println("There is an error - James " + e.getMessage());
        }

        return propertyRecord;
    };


    private FileReader openFile(String filename) throws FileNotFoundException {
        return new FileReader(new File(filename));
    }
}
