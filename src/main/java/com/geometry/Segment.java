package com.geometry;

public class Segment {
    public final Point p1, p2;

    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public double area() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "Segment[" + p1 + " -> " + p2 + "]";
    }
}