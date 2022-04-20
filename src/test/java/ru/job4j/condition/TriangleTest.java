package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void whenExistThanExist() {
        double ab = 15;
        double ac = 20;
        double bc = 22;
        boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertTrue(result);
    }

    @Test
    public void whenNotExistThanNotExist() {
        double ab = 12;
        double ac = 21;
        double bc = 100;
        boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertFalse(result);
    }
}