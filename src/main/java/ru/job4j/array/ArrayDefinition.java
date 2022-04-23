package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Array size: " + ages.length);

        String[] surnames = new String[100500];
        System.out.println("Array size: " + surnames.length);

        float[] prises = new float[40];
        System.out.println("Array size: " + prises.length);
    }
}
