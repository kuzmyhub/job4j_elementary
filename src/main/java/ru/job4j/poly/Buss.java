package ru.job4j.poly;

public class Buss implements Vehicle {

    @Override
    public void move() {
        System.out.println("Движется по трассе");
    }

    @Override
    public void seatsCount() {
        System.out.println("48 мест");
    }
}
