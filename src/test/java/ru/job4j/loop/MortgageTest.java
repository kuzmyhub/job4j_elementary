package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.Assert;

public class MortgageTest {

    @Test
    public void whenAmount1000Salary1200percent1Then1Year() {
        double amount = 1000;
        int salary = 1200;
        double percent = 1;
        int result = Mortgage.year(amount, salary, percent);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenAmount100Salary120percent50Then2Years() {
        double amount = 100;
        int salary = 120;
        double percent = 50;
        int result = Mortgage.year(amount, salary, percent);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }
}