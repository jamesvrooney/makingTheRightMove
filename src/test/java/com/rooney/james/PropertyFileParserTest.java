package com.rooney.james;

import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by jamesvrooney on 31/12/2017.
 */
public class PropertyFileParserTest {
    PropertyFileParser propertyFileParser;

    @Before
    public void setUp() throws Exception {
        propertyFileParser = new PropertyFileParser();
    }

    @Test
    public void testParsePropertyFile() throws FileNotFoundException {
        String filename = "src/test/resources/property-data.csv";

        List<PropertyRecord> propertyRecords = propertyFileParser.readPropertyFile(filename);

        int expectedSize = 22;

        assertThat(propertyRecords.size(), is(equalTo(expectedSize)));
    }
}
