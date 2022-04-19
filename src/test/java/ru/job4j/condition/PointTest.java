package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00To20Then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double out = Point.distance(0, 0, 2, 0);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when02To02Then0() {
        int x1 = 0;
        int y1 = 2;
        int x2 = 0;
        int y2 = 2;
        double expected = 0;
        double out = Point.distance(0, 2, 0, 2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when82to59Then761() {
        int x1 = 8;
        int y1 = 2;
        int x2 = 5;
        int y2 = 9;
        double expected = 7.61;
        double out = Point.distance(8, 2, 5, 9);
        Assert.assertEquals(expected, out, 0.01);
    }
}