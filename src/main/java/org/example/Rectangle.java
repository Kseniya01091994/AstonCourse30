package org.example;

public class Rectangle implements Shape {
    private double width;
    private double height;
    private String fillColor;
    private String borderColor;

    public Rectangle(double width, double height, String fillColor, String borderColor) {
        if (isValidSize(width, height)) {
            this.width = width;
            this.height = height;
        } else {
            this.width = 1.0;
            this.height = 1.0;
        }
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public double getArea() {
        return width * height;
    }

    public String getFillColor() {
        return fillColor;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public String getName() {
        return "Прямоугольник";
    }
}

