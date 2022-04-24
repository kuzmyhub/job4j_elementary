package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHasNot10ThenMinus1() {
        int[] data = {9, 19, 29, 39, 49, 59};
        int el = 10;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDiapasonHas2Then3() {
        int[] data = {5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenDiapasonHas6Then6() {
        int[] data = {3, 5, 7, 9, 11, 13, 15};
        int el = 15;
        int start = 0;
        int finish = 6;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 6;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenDiapasonHasXThenX() {
        int[] data = {2, 3, 4, 5, 6, 7};
        int el = 2;
        int start = 0;
        int finish = 3;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }
}