package ru.job4j.poly;

public class TypeConversion {
    public static void main(String[] args) {
        Vehicle plane = new Plane();
        Vehicle buss = new Buss();
        Vehicle train = new Train();

        Vehicle[] vehicle = new Vehicle[]{plane, buss, train};

        for (Vehicle a : vehicle) {
            a.move();
            a.seatsCount();
        }
    }
}
