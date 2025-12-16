package org.example;

public class Main {
    public static void main(String[] args) {
        Product[] productsArray = new Product[5];

        productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025",
                "Samsung Corp.", "Korea", 5599, true);

        productsArray[1] = new Product("iPhone 15 Pro Max", "15.09.2024",
                "Apple Inc.", "USA", 6499, false);

        productsArray[2] = new Product("Xiaomi 14 Pro", "20.11.2024",
                "Xiaomi Corporation", "China", 3299, true);

        productsArray[3] = new Product("Samsung A11", "04.10.2023",
                "Samsung Corp.", "Korea", 3499, false);

        productsArray[4] = new Product("iPhone 16", "11.02.2025",
                "Apple Inc.", "USA", 7899, false);


        for (int i = 0; i < productsArray.length; i++) {
            System.out.println("Товар " + (i + 1) + ":");
            productsArray[i].printInfo();
        }

        System.out.println("\n=== Проверка класса Park ===\n");

        Park park = new Park();

        Park.Attraction attraction1 = park.new Attraction("Карусель", "09:00 - 21:00", 300);

        System.out.println("Аттракцион 1:");
        attraction1.printInfo();
        System.out.println();

    }
}