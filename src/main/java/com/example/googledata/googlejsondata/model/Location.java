package com.example.googledata.googlejsondata.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Location {

    @JsonProperty(value = "lat")
    private String latitude;

    @JsonProperty(value = "lng")
    private String longitude;

    public String getLatitude() {
        return latitude;
    }

    @Override
    public String toString() {
        return "Location{" +
                "latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                '}';
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
}
