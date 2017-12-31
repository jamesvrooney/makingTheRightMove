package com.rooney.james;

/**
 * Created by jamesvrooney on 31/12/2017.
 */
public enum PropertyType {
    DETACHED("Detached"),
    FLAT("Flat"),
    MANSION("Mansion"),
    TERRACED("Terraced");

    private String type;

    PropertyType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
