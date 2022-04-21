package ru.job4j.condition;

public class LogicNot {

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return notEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || notPositive(num);
    }

    public static void main(String[] args) {
        System.out.println(isEven(5) + System.lineSeparator()
        + isPositive(5) + System.lineSeparator()
        + notEven(5) + System.lineSeparator()
        + notPositive(5) + System.lineSeparator()
        + notEvenAndPositive(5) + System.lineSeparator()
        + evenOrNotPositive(5) + System.lineSeparator());
    }
}
