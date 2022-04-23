package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 2 + 3;
        }

        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }
    }
}
