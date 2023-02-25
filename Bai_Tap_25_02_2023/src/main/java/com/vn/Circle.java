package com.vn;

public class Circle {
    private Double radius = 1.0;
    private String color = "Red";

    public Circle() {
    }

    public Circle(Double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + "\', " +
                "area=" + getArea() +
                '}';
    }
}
