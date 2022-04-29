package ru.job4j.oop;

public class Max {
    public static int max(int first, int second) {
        return Math.max(first, second);
    }

    public static int max(int first, int second, int third) {
        return max(first, (max(second, third)));
    }

    public static int max(int first, int second, int third, int fourth) {
        return max(first, max(second, third, fourth));
    }

    public static void main(String[] args) {
        System.out.println(max(1, 2));
        System.out.println(max(1, 2, 3));
        System.out.println(max(1, 2, 3, 4));
    }
}

