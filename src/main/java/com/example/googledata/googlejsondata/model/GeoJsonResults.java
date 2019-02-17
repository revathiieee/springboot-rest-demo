package com.example.googledata.googlejsondata.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GeoJsonResults {

    @JsonProperty(value = "formatted_address")
    private String formattedAddr;

    @JsonProperty(value = "geometry")
    private Geometry geometry;

    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    public String getFormattedAddr() {
        return formattedAddr;
    }

    public void setFormattedAddr(String formattedAddr) {
        this.formattedAddr = formattedAddr;
    }

    @Override
    public String toString() {
        return "GeoJsonResults{" +
                "formattedAddr='" + formattedAddr + '\'' +
                ", geometry=" + geometry +
                '}';
    }
}
