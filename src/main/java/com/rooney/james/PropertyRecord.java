package com.rooney.james;

/**
 * Created by jamesvrooney on 31/12/2017.
 */
public class PropertyRecord {
    long propertyReference;
    Integer price;
    int numBedrooms;
    int numBathrooms;
    String houseNumber;
    String address;
    String region;
    Postcode postcode;
    PropertyType propertyType;

    public PropertyRecord(long propertyReference, Integer price, int numBedrooms, int numBathrooms, String houseNumber, String address, String region, Postcode postcode, PropertyType propertyType) {
        this.propertyReference = propertyReference;
        this.price = price;
        this.numBedrooms = numBedrooms;
        this.numBathrooms = numBathrooms;
        this.houseNumber = houseNumber;
        this.address = address;
        this.region = region;
        this.postcode = postcode;
        this.propertyType = propertyType;
    }

    public long getPropertyReference() {
        return propertyReference;
    }

    public void setPropertyReference(long propertyReference) {
        this.propertyReference = propertyReference;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public int getNumBedrooms() {
        return numBedrooms;
    }

    public void setNumBedrooms(int numBedrooms) {
        this.numBedrooms = numBedrooms;
    }

    public int getNumBathrooms() {
        return numBathrooms;
    }

    public void setNumBathrooms(int numBathrooms) {
        this.numBathrooms = numBathrooms;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Postcode getPostcode() {
        return postcode;
    }

    public void setPostcode(Postcode postcode) {
        this.postcode = postcode;
    }

    public PropertyType getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(PropertyType propertyType) {
        this.propertyType = propertyType;
    }
}
