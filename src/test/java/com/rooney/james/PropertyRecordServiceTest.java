package com.rooney.james;

import org.javatuples.Pair;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by jamesvrooney on 31/12/2017.
 */
public class PropertyRecordServiceTest {
    private PropertyRecordService propertyRecordService;
    private List<PropertyRecord> propertyRecords;
    private PropertyFileParser propertyFileParser = new PropertyFileParser();

    @Before
    public void setUp() throws Exception {
        String filename = "src/test/resources/property-data.csv";

        propertyRecords = propertyFileParser.readPropertyFile(filename);

        propertyRecordService = new PropertyRecordServiceImpl();
    }

    @Test
    public void getAveragePriceInPostcodeOuter() throws Exception {
        // Given
        String outwardCode = "W1F";

        Double actualAveragePrice = propertyRecordService.getAveragePriceInPostcodeOuter(propertyRecords, outwardCode);

        Double expectedAveragePrice = 1158750.0;

        assertThat(actualAveragePrice, is(equalTo(expectedAveragePrice)));
    }

    @Test
    public void getTopNPercentMostExpensiveProperties() throws Exception {
        // Given
        Double percent = 10.0;

        List<PropertyRecord> actualResults = propertyRecordService.getTopNPercentMostExpensiveProperties(propertyRecords, percent);

        int expectedResult = 2;

        assertThat(actualResults.size(), is(equalTo(expectedResult)));
    }

    @Test
    public void getDifferenceInAveragePricesBetweenTypes() throws Exception {
        // Given
        Pair<PropertyType, PropertyType> propertyTypes = new Pair<>(PropertyType.DETACHED, PropertyType.FLAT);

        long actualDifference = propertyRecordService.getDifferenceInAveragePricesBetweenTypes(propertyRecords, propertyTypes);

        long expectedDifference = 29766;

        assertThat(actualDifference, is(equalTo(expectedDifference)));
    }
}
