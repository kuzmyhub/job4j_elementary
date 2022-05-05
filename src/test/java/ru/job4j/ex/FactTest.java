package ru.job4j.ex;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactTest {

    @Test (expected = IllegalArgumentException.class)
    public void whenMinus1ThenException() {
        Fact fact = new Fact();
        int in = -1;
        int rsl = fact.calc(in);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenMinus2ThenException() {
        int in = -2;
        int rsl = new Fact().calc(in);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenMinus10ThenException() {
        int in = -10;
        new Fact().calc(in);
    }
}