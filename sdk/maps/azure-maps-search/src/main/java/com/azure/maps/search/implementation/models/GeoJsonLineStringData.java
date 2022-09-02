// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.search.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The GeoJsonLineStringData model. */
@Fluent
public class GeoJsonLineStringData {
    /*
     * Coordinates for the `GeoJson LineString` geometry.
     */
    @JsonProperty(value = "coordinates", required = true)
    private List<List<Double>> coordinates;

    /**
     * Get the coordinates property: Coordinates for the `GeoJson LineString` geometry.
     *
     * @return the coordinates value.
     */
    public List<List<Double>> getCoordinates() {
        return this.coordinates;
    }

    /**
     * Set the coordinates property: Coordinates for the `GeoJson LineString` geometry.
     *
     * @param coordinates the coordinates value to set.
     * @return the GeoJsonLineStringData object itself.
     */
    public GeoJsonLineStringData setCoordinates(List<List<Double>> coordinates) {
        this.coordinates = coordinates;
        return this;
    }
}
