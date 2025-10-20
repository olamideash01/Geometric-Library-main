package com.geometry;

import org.locationtech.jts.geom.Coordinate;

public class Point {
    public final double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double area() {
        return 0.0;
    }

    public Point intersect(Point other) {
        if (this.x == other.x && this.y == other.y) {
            return this;
        }
        return null;
    }

    @Override
    public String toString() {
        return String.format("(%.1f, %.1f)", x, y);
    }

    public Coordinate toCoordinate() {
        return new Coordinate(x, y);
    }
}