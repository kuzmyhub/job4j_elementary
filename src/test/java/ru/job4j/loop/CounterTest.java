package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.Assert;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(1, 10);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromFiveToFifteenThenFifty() {
        int start = 5;
        int finish = 15;
        int result = Counter.sumByEven(5, 15);
        int expected = 50;
        Assert.assertEquals(expected, result);
    }
}