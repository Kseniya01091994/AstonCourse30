package org.example;

public class LessonFour {
    public static void main(String[] args) {
        System.out.println("=== Задание 1: Животные ===\n");

        // Создаем собак
        Dog dog1 = new Dog("Бобик");
        Dog dog2 = new Dog("Шарик");

        // Создаем котов
        Cat cat1 = new Cat("Мурзик");
        Cat cat2 = new Cat("Барсик");
        Cat cat3 = new Cat("Васька");

        // Тестируем бег
        System.out.println("--- Тест бега ---");
        dog1.run(150);
        dog1.run(600); // превышает лимит
        cat1.run(150);
        cat1.run(250); // превышает лимит
        System.out.println();

        // Тестируем плавание
        System.out.println("--- Тест плавания ---");
        dog1.swim(5);
        dog1.swim(15); // превышает лимит
        cat1.swim(10); // кот не умеет плавать
        System.out.println();

        // Выводим статистику
        System.out.println("--- Статистика ---");
        System.out.println("Создано животных: " + Animal.getAnimalCount());
        System.out.println("Создано собак: " + Dog.getDogCount());
        System.out.println("Создано котов: " + Cat.getCatCount());
        System.out.println();

        // Работа с миской и котами
        System.out.println("=== Работа с миской ===\n");

        // Создаем миску с едой
        Food food = new Food(30);

        // Создаем массив котов
        Cat[] cats = {
            new Cat("Мурзик"),
            new Cat("Барсик"),
            new Cat("Васька"),
            new Cat("Рыжик"),
            new Cat("Пушок")
        };

        System.out.println("В миске изначально: " + food.getFoodAmount() + " еды\n");

        // Коты пытаются покушать
        System.out.println("--- Коты едят ---");
        for (int i = 0; i < cats.length; i++) {
            cats[i].eatFromBowl(food, 10);
        }
        System.out.println();

        // Выводим информацию о сытости котов
        System.out.println("--- Информация о сытости котов ---");
        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i].name + ": " + (cats[i].isFull() ? "Сыт" : "Голоден"));
        }
        System.out.println();

        // Добавляем еду в миску
        System.out.println("--- Добавление еды в миску ---");
        food.addFood(50);
        System.out.println("В миске сейчас: " + food.getFoodAmount() + " еды\n");

        // Оставшиеся коты пытаются покушать
        System.out.println("--- Оставшиеся коты едят ---");
        for (int i = 0; i < cats.length; i++) {
            if (!cats[i].isFull()) {
                cats[i].eatFromBowl(food, 10);
            }
        }
        System.out.println();

        // Финальная информация о сытости
        System.out.println("--- Финальная информация о сытости ---");
        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i].name + ": " + (cats[i].isFull() ? "Сыт" : "Голоден"));
        }
    }
}
