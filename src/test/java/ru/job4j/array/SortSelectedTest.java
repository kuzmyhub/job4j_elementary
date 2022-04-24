package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.Assert;

public class SortSelectedTest {
    @Test
    public void whenSortArrayOf5ElementsThan12345() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf3ElementsThen112233() {
        int[] data = {22, 11, 33};
        int[] result = SortSelected.sort(data);
        int[] expected = {11, 22, 33};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf5ElementsThen() {
        int[] data = {3, 9, 5, 38, 11};
        int[] result = SortSelected.sort(data);
        int[] expected = {3, 5, 9, 11, 38};
        Assert.assertArrayEquals(expected, result);
    }
}