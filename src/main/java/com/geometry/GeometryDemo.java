package com.geometry;

public class GeometryDemo {
    public static void main(String[] args) {
        System.out.println("=== GEOMETRIC LIBRARY DEMO (Variant 14) ===\n");

        // 1. Point operations
        Point p1 = new Point(2.0, 2.0);
        Point p2 = new Point(2.0, 2.0);
        Point p3 = new Point(5.0, 5.0);

        System.out.println("• Point p1: " + p1 + " | Area: " + p1.area());
        System.out.println("• p1 ∩ p2: " + p1.intersect(p2));
        System.out.println("• p1 ∩ p3: " + p1.intersect(p3));
        System.out.println();

        // 2. Segment
        Segment seg = new Segment(new Point(0, 0), new Point(3, 0));
        System.out.println("• Segment: " + seg + " | Area: " + seg.area());
        System.out.println();

        // 3. Polygons
        Point[] triangle = {
                new Point(0, 0),
                new Point(4, 0),
                new Point(2, 3)
        };
        Polygon poly1 = new Polygon(triangle);
        System.out.println("• Polygon 1: " + poly1);

        Point[] square = {
                new Point(1, 1),
                new Point(3, 1),
                new Point(3, 3),
                new Point(1, 3)
        };
        Polygon poly2 = new Polygon(square);
        System.out.println("• Polygon 2: " + poly2);
        System.out.println();

        // 4. Boolean operations
        Polygon intersection = poly1.intersect(poly2);
        System.out.println("• Intersection: " +
                (intersection != null ? intersection + " (area: " + String.format("%.2f", intersection.area()) + ")" : "empty"));

        Polygon union = poly1.union(poly2);
        System.out.println("• Union: " +
                (union != null ? union + " (area: " + String.format("%.2f", union.area()) + ")" : "not a single polygon"));

        Polygon subtraction = poly1.subtract(poly2);
        System.out.println("• Subtraction (P1 - P2): " +
                (subtraction != null ? subtraction + " (area: " + String.format("%.2f", subtraction.area()) + ")" : "empty"));
        System.out.println();

        // 5. Group
        Group group = new Group();
        group.add(poly1);
        group.add(poly2);
        group.add(p1);
        group.add(seg);
        System.out.println("• Group: " + group);
        System.out.println();

        System.out.println("✅ Demo complete! All operations shown in console.");
    }
}