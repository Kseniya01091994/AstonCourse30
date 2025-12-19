package org.example;

public class Figure {
    public static void main(String[] args) {
        System.out.println("=== Задание 2: Геометрические фигуры ===\n");

        // Создаем круг
        Shape circle = new Circle(5.0, "Красный", "Черный");
        circle.printInfo();

        // Создаем прямоугольник
        Shape rectangle = new Rectangle(10.0, 6.0, "Синий", "Зеленый");
        rectangle.printInfo();

        // Создаем треугольник
        Shape triangle = new Triangle(3.0, 4.0, 5.0, "Желтый", "Коричневый");
        triangle.printInfo();

        // Дополнительные примеры
        System.out.println("=== Дополнительные примеры ===\n");

        Shape circle2 = new Circle(7.5, "Фиолетовый", "Белый");
        circle2.printInfo();

        Shape rectangle2 = new Rectangle(15.0, 8.0, "Оранжевый", "Серый");
        rectangle2.printInfo();

        Shape triangle2 = new Triangle(6.0, 8.0, 10.0, "Розовый", "Черный");
        triangle2.printInfo();
    }
}

