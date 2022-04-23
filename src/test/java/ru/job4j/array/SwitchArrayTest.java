package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.Assert;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap1To2Than1549() {
        int[] input = {1, 4, 5, 9};
        int source = 1;
        int dest = 2;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 5, 4, 9};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap2To3Than23423991284() {
        int[] input = {2, 34, 99, 23, 12, 84};
        int source = 2;
        int dest = 3;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {2, 34, 23, 99, 12, 84};
        Assert.assertArrayEquals(expected, result);
    }
}