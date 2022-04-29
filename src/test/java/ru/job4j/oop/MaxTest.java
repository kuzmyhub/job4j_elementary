package ru.job4j.oop;

import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.Assert;

public class MaxTest {

    @Test
    public void whenMax1234Then4() {
        int first = 1;
        int second = 2;
        int third = 3;
        int fourth = 4;
        int result = Max.max(first, second, third, fourth);
        int expected = 4;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax5468Then8() {
        int first = 5;
        int second = 4;
        int third = 6;
        int fourth = 8;
        int result = Max.max(first, second, third, fourth);
        int expected = 8;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax8951Then9() {
        int first = 8;
        int second = 9;
        int third = 5;
        int fourth = 1;
        int result = Max.max(first, second, third, fourth);
        int expected = 9;
        Assert.assertEquals(expected, result);
    }
}