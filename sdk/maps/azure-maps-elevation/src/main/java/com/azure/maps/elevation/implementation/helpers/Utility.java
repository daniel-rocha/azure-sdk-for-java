package com.azure.maps.elevation.implementation.helpers;

import java.util.ArrayList;
import java.util.List;

import com.azure.core.models.GeoPosition;
import com.azure.maps.elevation.implementation.models.LatLongPairAbbreviated;

public class Utility {
    
    public static List<LatLongPairAbbreviated> toLatLongPairAbbreviated(List<GeoPosition> points) {
        List<LatLongPairAbbreviated> points2 = new ArrayList<>();
        for (GeoPosition point : points) {
            points2.add(new LatLongPairAbbreviated().setLat(point.getLatitude()).setLon(point.getLongitude()));
        }
        return points2;
    }
}
