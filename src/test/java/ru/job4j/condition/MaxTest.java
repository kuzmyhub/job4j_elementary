package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax10To5Then10() {
        int left = 10;
        int right = 5;
        int result = Max.max(10,5);
        int expected = 10;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax2To9Then9() {
        int left = 2;
        int right = 9;
        int result = Max.max(left, right);
        int expected = 9;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax8To8Then8() {
        int left = 8;
        int right = 8;
        int result = Max.max(left, right);
        int expected = 8;
        Assert.assertEquals(expected, result);
    }
}