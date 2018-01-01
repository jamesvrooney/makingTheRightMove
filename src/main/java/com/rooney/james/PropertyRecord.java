package com.rooney.james;

/**
 * Created by jamesvrooney on 31/12/2017.
 */
public class PropertyRecord {
    private long propertyReference;
    private Integer price;
    private int numBedrooms;
    private int numBathrooms;
    private String houseNumber;
    private String address;
    private String region;
    private Postcode postcode;
    private PropertyType propertyType;

    private PropertyRecord(final long propertyReference, final Integer price, final int numBedrooms, final int numBathrooms,
                           final String houseNumber, final String address, final String region, final Postcode postcode,
                           final PropertyType propertyType) {
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

    public static class PropertyRecordBuilder {
        private long propertyReference;
        private int price;
        private int numBedrooms;
        private int numBathrooms;
        private String houseNumber;
        private String address;
        private String region;
        private Postcode postcode;
        private PropertyType propertyType;

        public PropertyRecordBuilder withPropertyReference(long propertyReference) {
            this.propertyReference = propertyReference;

            return this;
        }

        public PropertyRecordBuilder withPrice(Integer price) {
            this.price = price;

            return this;
        }

        public PropertyRecordBuilder withNumBedrooms(int numBedrooms) {
            this.numBedrooms = numBedrooms;

            return this;
        }

        public PropertyRecordBuilder withNumBathrooms(int numBathrooms) {
            this.numBathrooms = numBathrooms;

            return this;
        }

        public PropertyRecordBuilder withHouseNumber(String houseNumber) {
            this.houseNumber = houseNumber;

            return this;
        }

        public PropertyRecordBuilder withAddress(String address) {
            this.address = address;

            return this;
        }

        public PropertyRecordBuilder withRegion(String region) {
            this.region = region;

            return this;
        }

        public PropertyRecordBuilder withPostcode(Postcode postcode) {
            this.postcode = postcode;

            return this;
        }

        public PropertyRecordBuilder withPropertyType(PropertyType propertyType) {
            this.propertyType = propertyType;

            return this;
        }

        public PropertyRecord build()
        {
            return new PropertyRecord(propertyReference, price, numBedrooms,
                    numBathrooms, houseNumber, address,
                    region, postcode, propertyType);
        }
    }
}
