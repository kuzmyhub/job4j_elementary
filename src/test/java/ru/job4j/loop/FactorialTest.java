package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.Assert;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int in = 5;
        int out = Factorial.calc(in);
        int expected = 120;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int in = 0;
        int out = Factorial.calc(in);
        int expected = 1;
        Assert.assertEquals(expected, out);
    }
}