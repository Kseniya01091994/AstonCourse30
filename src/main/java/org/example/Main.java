package org.example;

public class Main {
    public static void main(String[] args) {
        // Создание и вывод массива из 5 товаров
        ProductManager.createAndDisplayProducts();

        System.out.println("\n=== Проверка класса Park ===\n");

        Park park = new Park();

        Park.Attraction attraction1 = park.new Attraction("Карусель", "09:00 - 21:00", 300);

        System.out.println("Аттракцион 1:");
        attraction1.printInfo();
        System.out.println();

    }
}