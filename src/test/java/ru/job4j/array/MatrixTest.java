package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.Assert;

public class MatrixTest {
    @Test
    public void when2on2() {
        int size = 2;
        int[][] result = Matrix.multiple(size);
        int[][] expected = {
                {1, 2},
                {2, 4}
        };
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void when5on5() {
        int size = 5;
        int[][] result = Matrix.multiple(size);
        int[][] expected = {
                {1, 2, 3, 4, 5},
                {2, 4, 6, 8, 10},
                {3, 6, 9, 12, 15},
                {4, 8, 12, 16, 20},
                {5, 10, 15, 20, 25}
        };
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void when7on7() {
        int size = 7;
        int[][] result = Matrix.multiple(7);
        int[][] expected = {{1, 2, 3, 4, 5, 6, 7},
                {2, 4, 6, 8, 10, 12, 14},
                {3, 6, 9, 12, 15, 18, 21},
                {4, 8, 12, 16, 20, 24, 28},
                {5, 10, 15, 20, 25, 30, 35},
                {6, 12, 18, 24, 30, 36, 42},
                {7, 14, 21, 28, 35, 42, 49}};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void when6on6() {
        int size = 6;
        int[][] result = Matrix.multiple(6);
        int[][] expected = {{1, 2, 3, 4, 5, 6},
                {2, 4, 6, 8, 10, 12},
                {3, 6, 9, 12, 15, 18},
                {4, 8, 12, 16, 20, 24},
                {5, 10, 15, 20, 25, 30},
                {6, 12, 18, 24, 30, 36}};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenHasMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
        };
        int column = 2;
        boolean result = MatrixCheck.monoVertical(input, column);
        Assert.assertTrue(result);
    }

    @Test
    public void whenHasNotMonoVertical() {
        char[][] input = {
                {' ', 'X', ' '},
                {' ', 'X', ' '},
                {' ', 'X', ' '}
        };
        int colum = 2;
        boolean result = MatrixCheck.monoVertical(input, colum);
        Assert.assertFalse(result);
    }
}