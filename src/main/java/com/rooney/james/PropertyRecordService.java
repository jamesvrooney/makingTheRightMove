package com.rooney.james;

import java.util.List;

/**
 * Created by jamesvrooney on 31/12/2017.
 */
public interface PropertyRecordService {
    Double getAveragePriceInPostcodeOuter(List<PropertyRecord> propertyRecords, String outwardCode);

    List<PropertyRecord> getTopNPercentMostExpensiveProperties(List<PropertyRecord> propertyRecords, Double percent);

    long getDifferenceInAveragePricesBetweenTypes(List<PropertyRecord> propertyRecords, List<PropertyType> propertyTypes);
}
