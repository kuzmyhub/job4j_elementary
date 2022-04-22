package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = number > 1;
        for (int i = 2; i < number; i++) {
            int remains = number % i;
            if (remains == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
