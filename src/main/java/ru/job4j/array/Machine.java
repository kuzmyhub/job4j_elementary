package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int difference = money - price;
        for (int i = 0; i < coins.length; i++) {
            while (difference >= coins[i]) {
                int temp = difference - coins[i];
                int point = 0;
                rsl[point] = coins[i];
                point++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}