package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.Assert;

public class TurnTest {

    @Test
    public void whenArray4162FlipThan2614() {
        int[] input = {4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expected = {2, 6, 1, 4};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenArray45678FlipThan87654() {
        int[] input = {4, 5, 6, 7, 8};
        int[] result = Turn.back(input);
        int[] expected = {8, 7, 6, 5, 4};
        Assert.assertArrayEquals(expected, result);
    }
}