package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float value = 140;
        float euro = Converter.rubleToEuro(value);
        float dollars = Converter.rubleToDollar(value);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollars + " dollars.");
        float in = 140;
        float expectedEuro = 2;
        float expectedDollar = 2.3333333F;
        float outEuro = Converter.rubleToEuro(in);
        float outDollar = Converter.rubleToDollar(in);
        boolean passedEuro = expectedEuro == outEuro;
        boolean passedDollar = expectedDollar == outDollar;
        System.out.println("140 rubles are 2 euro: " + passedEuro);
        System.out.println("140 rubles are 2 dollars: " + passedDollar);
    }
}
