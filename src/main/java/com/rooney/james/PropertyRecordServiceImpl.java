package com.rooney.james;

import java.util.List;

/**
 * Created by jamesvrooney on 31/12/2017.
 */
public class PropertyRecordServiceImpl implements PropertyRecordService {
    @Override
    public Double getAveragePriceInPostcodeOuter(List<PropertyRecord> propertyRecords, String outwardCode) {
        return null;
    }

    @Override
    public List<PropertyRecord> getTopNPercentMostExpensiveProperties(List<PropertyRecord> propertyRecords, Double percent) {
        return null;
    }

    @Override
    public long getDifferenceInAveragePricesBetweenTypes(List<PropertyRecord> propertyRecords, List<PropertyType> propertyTypes) {
        return 0;
    }
}
