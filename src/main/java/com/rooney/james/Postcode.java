package com.rooney.james;

/**
 * Created by jamesvrooney on 31/12/2017.
 */
public class Postcode {
    private String outwardCode;
    private String inwardCode;

    public Postcode(String outwardCode, String inwardCode) {
        this.outwardCode = outwardCode;
        this.inwardCode = inwardCode;
    }

    public Postcode(String[] postcodeParts) {
        this(postcodeParts[0], postcodeParts[1]);
    }

    public Postcode(String postCode) {
        String WHITESPACE_CHARACTER = "\\s";

        String[] postcodeParts = postCode.split(WHITESPACE_CHARACTER);

        this.outwardCode = postcodeParts[0];
        this.inwardCode = postcodeParts[1];
    }

    public String getOutwardCode() {
        return outwardCode;
    }

    public void setOutwardCode(String outwardCode) {
        this.outwardCode = outwardCode;
    }

    public String getInwardCode() {
        return inwardCode;
    }

    public void setInwardCode(String inwardCode) {
        this.inwardCode = inwardCode;
    }
}
