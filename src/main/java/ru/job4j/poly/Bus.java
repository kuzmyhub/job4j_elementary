package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void ride() {
        System.out.println("Остановка");
        System.out.println("Двери открываются");
        System.out.println("Двери закрываются");
        System.out.println("Следующая остановка");
    }

    @Override
    public void passengers(int count) {
        System.out.println("Количество выданных билетов" + count);
    }

    @Override
    public int refuel(int fuel) {
        int fuelCost = 55;
        return fuelCost * fuel;
    }
}
