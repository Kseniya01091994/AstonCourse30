package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    // Тесты для факториала
    @Test
    @DisplayName("Тест факториала: факториал 0 должен быть равен 1")
    void testFactorialZero() {
        assertEquals(1, Calculator.calculateFactorial(0));
    }

    @Test
    @DisplayName("Тест факториала: факториал 1 должен быть равен 1")
    void testFactorialOne() {
        assertEquals(1, Calculator.calculateFactorial(1));
    }

    @Test
    @DisplayName("Тест факториала: факториал 5 должен быть равен 120")
    void testFactorialFive() {
        assertEquals(120, Calculator.calculateFactorial(5));
    }

    @Test
    @DisplayName("Тест факториала: отрицательное число должно выбрасывать исключение")
    void testFactorialNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            Calculator.calculateFactorial(-1);
        });
    }

    // Тесты для площади треугольника
    @Test
    @DisplayName("Тест площади треугольника: основание 10, высота 5 должна дать площадь 25")
    void testTriangleArea1() {
        assertEquals(25.0, Calculator.calculateTriangleArea(10.0, 5.0), 0.001);
    }

    @Test
    @DisplayName("Тест площади треугольника: основание 6, высота 4 должна дать площадь 12")
    void testTriangleArea2() {
        assertEquals(12.0, Calculator.calculateTriangleArea(6.0, 4.0), 0.001);
    }

    @Test
    @DisplayName("Тест площади треугольника: отрицательное основание должно выбрасывать исключение")
    void testTriangleAreaNegativeBase() {
        assertThrows(IllegalArgumentException.class, () -> {
            Calculator.calculateTriangleArea(-5.0, 4.0);
        });
    }

    @Test
    @DisplayName("Тест площади треугольника: отрицательная высота должна выбрасывать исключение")
    void testTriangleAreaNegativeHeight() {
        assertThrows(IllegalArgumentException.class, () -> {
            Calculator.calculateTriangleArea(5.0, -4.0);
        });
    }

    // Тесты для арифметических действий
    @Test
    @DisplayName("Тест сложения: 5 + 3 должно быть равно 8")
    void testAdd() {
        assertEquals(8, Calculator.add(5, 3));
    }

    @Test
    @DisplayName("Тест вычитания: 10 - 4 должно быть равно 6")
    void testSubtract() {
        assertEquals(6, Calculator.subtract(10, 4));
    }

    @Test
    @DisplayName("Тест умножения: 7 * 6 должно быть равно 42")
    void testMultiply() {
        assertEquals(42, Calculator.multiply(7, 6));
    }

    @Test
    @DisplayName("Тест деления: деление на ноль должно выбрасывать исключение")
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> {
            Calculator.divide(10, 0);
        });
    }

    // Тесты для сравнения чисел
    @Test
    @DisplayName("Тест сравнения: 5 должно быть больше 3")
    void testCompareGreater() {
        assertEquals("5 больше 3", Calculator.compareNumbers(5, 3));
    }

    @Test
    @DisplayName("Тест сравнения: 2 должно быть меньше 7")
    void testCompareLess() {
        assertEquals("2 меньше 7", Calculator.compareNumbers(2, 7));
    }

    @Test
    @DisplayName("Тест сравнения: 4 должно быть равно 4")
    void testCompareEqual() {
        assertEquals("4 равно 4", Calculator.compareNumbers(4, 4));
    }
}