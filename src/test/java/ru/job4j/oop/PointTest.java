package ru.job4j.oop;

import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.Assert;

public class PointTest {

    @Test
    public void whenPoint149And349Than2() {
        int x1 = 1;
        int y1 = 4;
        int z1 = 9;
        int x2 = 3;
        int y2 = 4;
        int z2 = 9;
        Point a = new Point(x1, y1, z1);
        Point b = new Point(x2, y2, z2);
        double rsl = a.distance3D(b);
        double expected = 2;
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void whenPoint251And658Than8dot06() {
        int x1 = 2;
        int y1 = 5;
        int z1 = 1;
        int x2 = 6;
        int y2 = 5;
        int z2 = 8;
        Point a = new Point(x1, y1, z1);
        Point b = new Point(x2, y2, z2);
        double rsl = a.distance3D(b);
        double expected = 8.06;
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void whenPoint005And500Than8dot07() {
        int x1 = 0;
        int y1 = 0;
        int z1 = 5;
        int x2 = 5;
        int y2 = 0;
        int z2 = 0;
        Point a = new Point(x1, y1, z1);
        Point b = new Point(x2, y2, z2);
        double rsl = a.distance3D(b);
        double expected = 7.07;
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void whenPoint777And123Than8dot77() {
        int x1 = 7;
        int y1 = 7;
        int z1 = 7;
        int x2 = 1;
        int y2 = 2;
        int z2 = 3;
        Point a = new Point(x1, y1, z1);
        Point b = new Point(x2, y2, z2);
        double rsl = a.distance3D(b);
        double expected = 8.77;
        Assert.assertEquals(expected, rsl, 0.01);

    }
}