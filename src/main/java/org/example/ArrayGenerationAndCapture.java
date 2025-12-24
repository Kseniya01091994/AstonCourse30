package org.example;

public class ArrayGenerationAndCapture {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        try {
            numbers[2] = 10;
            System.out.println("Элемент по индексу 2: " + numbers[2]);

            System.out.println("Попытка доступа к элементу по индексу 5...");
            System.out.println(numbers[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Произошла ошибка: " + e.getMessage());
            System.err.println("Вы пытаетесь обратиться к элементу, который не существует.");
            System.err.println("Индекс должен быть от 0 до " + (numbers.length - 1));
        } finally {
            System.out.println("Блок finally всегда выполняется.");
        }
        System.out.println("Программа продолжает работу после обработки исключения.");
    }
}
