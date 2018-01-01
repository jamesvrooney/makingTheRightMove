package com.rooney.james;

import org.javatuples.Pair;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by jamesvrooney on 31/12/2017.
 */
public class PropertyRecordServiceImpl implements PropertyRecordService {
    @Override
    public Double getAveragePriceInPostcodeOuter(List<PropertyRecord> propertyRecords, String outwardCode) {
        OptionalDouble average = propertyRecords.stream()
                .filter(byOutwardCode(outwardCode))
                .mapToDouble(PropertyRecord::getPrice)
                .average();

        return average.getAsDouble();
    }

    @Override
    public List<PropertyRecord> getTopNPercentMostExpensiveProperties(List<PropertyRecord> propertyRecords, Double percent) {
        double numberOfRecords = propertyRecords.size();
        double percentage = numberOfRecords/percent;

        List<PropertyRecord> propertyRecordsOrderedByPriceDesc = propertyRecords.stream()
                .sorted(Comparator.comparingDouble(PropertyRecord::getPrice).reversed())
                .collect(Collectors.toList());

        int endIndex = (int)Math.round(percentage);
        List<PropertyRecord> topNPercentMostExpensive = propertyRecordsOrderedByPriceDesc.subList(0, endIndex);

        return topNPercentMostExpensive;
    }

    @Override
    public long getDifferenceInAveragePricesBetweenTypes(List<PropertyRecord> propertyRecords, Pair<PropertyType, PropertyType> propertyTypes) {
        Map<PropertyType, Double> averagePricePerType = propertyRecords.stream()
                .filter(propertyRecord -> propertyTypes.contains(propertyRecord.getPropertyType()))
                .collect(Collectors.groupingBy(PropertyRecord::getPropertyType, Collectors.averagingInt(PropertyRecord::getPrice)));

        Double difference = averagePricePerType.get(propertyTypes.getValue0()) - averagePricePerType.get(propertyTypes.getValue1());

        return Math.round(Math.abs(difference));
    }

    private static Predicate<PropertyRecord> byOutwardCode(String outwardCode) {
        return propertyRecord -> propertyRecord.getPostcode().getOutwardCode().equals(outwardCode);
    }
}
