package ru.job4j.oop;

public class Calculator {
     private static int x = 5;

     public int sumAllOperation(int d, int e, int f, int g) {
          return d + e + f + g;
     }

     public int divide(int c) {
          return c / x;
     }

     public static int minus(int b) {
          return  b - x;
     }

     public int multiply(int a) {
          return x * a;
     }

     public static int sum(int y) {
          return  x + y;
     }

     public static void main(String[] args) {
          int result = Calculator.sum(10);
          System.out.println(result);

          Calculator calculator = new Calculator();
          int rsl = calculator.multiply(5);
          System.out.println(rsl);

          int resultMinus = minus(2);
          int resultMultiply = calculator.multiply(3);
          int resultDivide = calculator.divide(4);
          int sumAll = result + resultMultiply
                  + resultMinus +  resultDivide;
          System.out.println(sumAll);
     }
}
