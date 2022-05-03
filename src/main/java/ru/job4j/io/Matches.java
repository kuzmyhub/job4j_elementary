package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3:");
            boolean limit = true;
            while (limit) {
                int matches = Integer.parseInt(input.nextLine());
                if (matches < 1) {
                    System.out.println("Вы взяли спичек меньше дозволенного. "
                            + "Введите число от 1 до 3:");
                } else if (matches > 3) {
                    System.out.println("Вы взяли спичек больше дозволенного. "
                            + "Введите число от 1 до 3:");
                } else if (count - matches < 0) {
                    System.out.println("Сейчас вы не можете взять больше "
                            + count + " спичек");
                } else {
                    limit = false;
                    count = count - matches;
                }
            }
            turn = !turn;
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}