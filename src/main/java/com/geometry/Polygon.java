package com.geometry;

import org.locationtech.jts.geom.*;
import org.locationtech.jts.geom.Geometry;

public class Polygon {
    private final org.locationtech.jts.geom.Polygon jtsPolygon;

    public Polygon(Point[] vertices) {
        if (vertices.length < 3) {
            throw new IllegalArgumentException("Polygon must have at least 3 vertices");
        }
        GeometryFactory factory = new GeometryFactory();
        Coordinate[] coords = new Coordinate[vertices.length + 1];
        for (int i = 0; i < vertices.length; i++) {
            coords[i] = vertices[i].toCoordinate();
        }
        coords[vertices.length] = vertices[0].toCoordinate(); // close the loop
        this.jtsPolygon = factory.createPolygon(coords);
    }

    public double area() {
        return jtsPolygon.getArea();
    }

    public Polygon intersect(Polygon other) {
        Geometry result = jtsPolygon.intersection(other.jtsPolygon);
        if (result.isEmpty()) return null;
        if (result instanceof org.locationtech.jts.geom.Polygon) {
            return fromJtsPolygon((org.locationtech.jts.geom.Polygon) result);
        }
        // For simplicity, ignore MultiPolygon results
        return null;
    }

    public Polygon union(Polygon other) {
        Geometry result = jtsPolygon.union(other.jtsPolygon);
        if (result instanceof org.locationtech.jts.geom.Polygon) {
            return fromJtsPolygon((org.locationtech.jts.geom.Polygon) result);
        }
        return null; // simplified
    }

    public Polygon subtract(Polygon other) {
        Geometry result = jtsPolygon.difference(other.jtsPolygon);
        if (result instanceof org.locationtech.jts.geom.Polygon) {
            return fromJtsPolygon((org.locationtech.jts.geom.Polygon) result);
        }
        return null;
    }

    private static Polygon fromJtsPolygon(org.locationtech.jts.geom.Polygon poly) {
        Coordinate[] coords = poly.getCoordinates();
        // Remove duplicate last point (JTS includes it)
        Point[] points = new Point[coords.length - 1];
        for (int i = 0; i < points.length; i++) {
            points[i] = new Point(coords[i].x, coords[i].y);
        }
        return new Polygon(points);
    }

    @Override
    public String toString() {
        return "Polygon[area=" + String.format("%.2f", area()) + "]";
    }
}