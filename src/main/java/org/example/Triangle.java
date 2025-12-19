package org.example;

public class Triangle implements Shape {
    private double base; // основание
    private double height; // высота
    private double side; // боковая сторона
    private String fillColor;
    private String borderColor;

    public Triangle(double base, double height, double side, String fillColor, String borderColor) {
        if (isValidSize(base, height, side)) {
            this.base = base;
            this.height = height;
            this.side = side;
        } else {
            this.base = 6.0;
            this.height = 4.0;
            this.side = 5.0;
        }
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }
    // Вычисляем вторую боковую сторону через теорему Пифагора
    private double getSecondSide() {
        // Вычисляем половину основания
        double halfBase = base / 2;
        // Вычисляем вторую боковую сторону через теорему Пифагора
        return Math.sqrt(height * height + halfBase * halfBase);
    }
    public double getPerimeter() {
        double secondSide = getSecondSide();
        return base + side + secondSide;
    }
    public double getArea() {
        return (base * height) / 2;
    }
    public String getFillColor() {
        return fillColor;
    }
    public String getBorderColor() {
        return borderColor;
    }
    public String getName() {
        return "Треугольник";
    }
}

