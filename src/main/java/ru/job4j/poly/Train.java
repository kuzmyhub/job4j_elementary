package ru.job4j.poly;

public class Train implements Vehicle {

    @Override
    public void move() {
        System.out.println("Движется по рельсам");
    }

    @Override
    public void seatsCount() {
        System.out.println("579 мест");
    }
}
