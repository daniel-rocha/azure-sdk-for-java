package com.azure.maps.elevation.implementation.helpers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.azure.core.models.GeoBoundingBox;
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

    public static List<String> geoPositionToString(List<GeoPosition> points) {
        List<String> points2 = new ArrayList<>();
        for (GeoPosition point : points) {
            points2.add(point.getLongitude() + "," + point.getLatitude());
        }
        return points2;
    }

    public static List<Float> geoBoundingBoxToFloat(GeoBoundingBox boundingBox) {
        return Arrays.asList((float) boundingBox.getWest(), (float) boundingBox.getSouth(), (float) boundingBox.getEast(), (float) boundingBox.getNorth());
    }
}
