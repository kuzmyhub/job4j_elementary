package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
     return sum(first, second) + multiply(first, second);
    }

    public static double sumDifferenceAndDivision(double first, double second) {
        return difference(first, second) + division(first, second);
    }

    public static double sumAll(double first, double second) {
        return sum(first, second) + multiply(first, second) + difference(first, second) + division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчётов #1 равен: " + sumAndMultiply(10, 20) + System.lineSeparator()
                + "Результат расчётов #2 равен: " + sumDifferenceAndDivision(10, 20) + System.lineSeparator()
                + "Результат расчётов #3 равен: " + sumAll(10, 20));
    }
}
