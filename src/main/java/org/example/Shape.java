package org.example;

public interface Shape {
    // Абстрактные методы
    double getPerimeter();
    double getArea();
    String getFillColor();
    String getBorderColor();
    String getName();

    // Дефолтный метод для вывода информации о фигуре
    default void printInfo() {
        System.out.println("=== " + getName() + " ===");
        System.out.println("Периметр: " + String.format("%.2f", getPerimeter()));
        System.out.println("Площадь: " + String.format("%.2f", getArea()));
        System.out.println("Цвет заливки: " + getFillColor());
        System.out.println("Цвет границы: " + getBorderColor());
        System.out.println();
    }

    // Дефолтный метод для проверки валидности размеров
    default boolean isValidSize(double... sizes) {
        for (double size : sizes) {
            if (size <= 0) {
                return false;
            }
        }
        return true;
    }
}

