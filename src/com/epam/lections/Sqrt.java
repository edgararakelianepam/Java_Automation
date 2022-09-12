package com.epam.lections;

public class Sqrt {
    public static void main(String[] args) {
        System.out.print(numSqrt(8));
    }
    public static int numSqrt(int x) {
        int sqr = (int) Math.sqrt(x);
        return sqr;
    }
}
