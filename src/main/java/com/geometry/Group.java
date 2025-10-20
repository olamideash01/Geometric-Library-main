package com.geometry;

import java.util.*;

public class Group {
    private final List<Object> objects = new ArrayList<>();

    public void add(Object obj) {
        if (obj instanceof Point || obj instanceof Segment || obj instanceof Polygon || obj instanceof Group) {
            objects.add(obj);
        } else {
            throw new IllegalArgumentException("Only geometric objects can be added to Group");
        }
    }

    public double area() {
        double total = 0.0;
        for (Object obj : objects) {
            if (obj instanceof Polygon) {
                total += ((Polygon) obj).area();
            } else if (obj instanceof Group) {
                total += ((Group) obj).area();
            }
            // Points and Segments contribute 0 area
        }
        return total;
    }

    public int size() {
        return objects.size();
    }

    @Override
    public String toString() {
        return "Group[size=" + size() + ", area=" + String.format("%.2f", area()) + "]";
    }
}