package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Array size: " + ages.length
                + System.lineSeparator());

        String[] surnames = new String[100500];
        System.out.println("Array size: " + surnames.length
                + System.lineSeparator());

        float[] prises = new float[40];
        System.out.println("Array size: " + prises.length
                + System.lineSeparator());

        String[] names = new String[4];
        names[0] = "Petr Arsentev";
        names[1] = "Sergey Kuznetsov";
        names[2] = "Nikola Tesla";
        names[3] = "Hayao Miadzaki";
        for (String name : names) {
            System.out.println(name);
        }
    }
}
