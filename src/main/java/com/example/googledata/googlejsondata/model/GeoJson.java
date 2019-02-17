package com.example.googledata.googlejsondata.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;

public class GeoJson
{
    @JsonProperty(value = "results")
    private GeoJsonResults[]  geoJsonResults;

    public GeoJsonResults[] getGeoJsonResults() {
        return geoJsonResults;
    }

    public void setGeoJsonResults(GeoJsonResults[] geoJsonResults) {
        this.geoJsonResults = geoJsonResults;
    }

    @Override
    public String toString() {
        return "GeoJson{" +
                "geoJsonResults=" + Arrays.toString(geoJsonResults) +
                '}';
    }
}
