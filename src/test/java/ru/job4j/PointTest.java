package ru.job4j;

import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when00To20Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double rsl = a.distance(b);
        double expected = 2.0;
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void when02To02Then0() {
        Point a = new Point(0, 2);
        Point b = new Point(0, 2);
        double rsl = a.distance(b);
        double expected = 0.0;
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void when82To59Then7dot61() {
        Point a = new Point(8, 2);
        Point b = new Point(5, 9);
        double rsl = a.distance(b);
        double expected = 7.61;
        Assert.assertEquals(expected, rsl, 0.01);
    }
}