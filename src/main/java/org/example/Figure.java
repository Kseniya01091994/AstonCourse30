package org.example;

public class Figure {
    public static void main(String[] args) {
        System.out.println("=== Задание 2: Геометрические фигуры ===\n");

        Shape circle = new Circle(5.0, "Красный", "Черный");
        circle.printInfo();

        Shape rectangle = new Rectangle(10.0, 6.0, "Синий", "Зеленый");
        rectangle.printInfo();

        Shape triangle = new Triangle(6.0, 4.0, 5.0, "Желтый", "Коричневый");
        triangle.printInfo();
    }
}

