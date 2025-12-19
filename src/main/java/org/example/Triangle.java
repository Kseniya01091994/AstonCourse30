package org.example;

public class Triangle implements Shape {
    private double sideA;
    private double sideB;
    private double sideC;
    private String fillColor;
    private String borderColor;

    public Triangle(double sideA, double sideB, double sideC, String fillColor, String borderColor) {
        if (isValidSize(sideA, sideB, sideC) && isValidTriangle(sideA, sideB, sideC)) {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        } else {
            this.sideA = 3.0;
            this.sideB = 4.0;
            this.sideC = 5.0;
        }
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    // Проверка на валидность треугольника (сумма двух сторон больше третьей)
    private boolean isValidTriangle(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    public double getArea() {
        // Формула Герона
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
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

