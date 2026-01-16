package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTestNG {

    // Тесты для факториала
    @Test
    public void testFactorialZero() {
        long result = Calculator.calculateFactorial(0);
        Assert.assertEquals(result, 1, "Факториал 0 должен быть равен 1");
    }

    @Test
    public void testFactorialOne() {
        long result = Calculator.calculateFactorial(1);
        Assert.assertEquals(result, 1, "Факториал 1 должен быть равен 1");
    }

    @Test
    public void testFactorialFive() {
        long result = Calculator.calculateFactorial(5);
        Assert.assertEquals(result, 120, "Факториал 5 должен быть равен 120");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testFactorialNegative() {
        Calculator.calculateFactorial(-1);
    }

    // Тесты для площади треугольника
    @Test
    public void testTriangleArea1() {
        double result = Calculator.calculateTriangleArea(10.0, 5.0);
        Assert.assertEquals(result, 25.0, 0.001, "Основание 10, высота 5 должна дать площадь 25");
    }

    @Test
    public void testTriangleArea2() {
        double result = Calculator.calculateTriangleArea(6.0, 4.0);
        Assert.assertEquals(result, 12.0, 0.001, "Основание 6, высота 4 должна дать площадь 12");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testTriangleAreaNegativeBase() {
        Calculator.calculateTriangleArea(-5.0, 4.0);
    }

    // Тесты для арифметических действий
    @Test
    public void testAdd() {
        int result = Calculator.add(5, 3);
        Assert.assertEquals(result, 8, "5 + 3 должно быть равно 8");
    }

    @Test
    public void testSubtract() {
        int result = Calculator.subtract(10, 4);
        Assert.assertEquals(result, 6, "10 - 4 должно быть равно 6");
    }

    @Test
    public void testMultiply() {
        long result = Calculator.multiply(7, 6);
        Assert.assertEquals(result, 42, "7 * 6 должно быть равно 42");
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivideByZero() {
        Calculator.divide(10, 0);
    }

    // Тесты для сравнения чисел
    @Test
    public void testCompareGreater() {
        String result = Calculator.compareNumbers(5, 3);
        Assert.assertEquals(result, "5 больше 3", "5 должно быть больше 3");
    }

    @Test
    public void testCompareLess() {
        String result = Calculator.compareNumbers(2, 7);
        Assert.assertEquals(result, "2 меньше 7", "2 должно быть меньше 7");
    }

    @Test
    public void testCompareEqual() {
        String result = Calculator.compareNumbers(4, 4);
        Assert.assertEquals(result, "4 равно 4", "4 должно быть равно 4");
    }
}
