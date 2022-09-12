package com.epam.lections;

public class FizzBuzz {
    public static void main(String[] args) {
        fizzBuzz(200);
        //show "Fizz" if a number divisible by 3
        // show "buzz" if a number divisible by 5
        // show "fizz-buzz" if a number divisible by both
    }
    public static void fizzBuzz(int i) {
        if (i % 3 == 0 && i % 5 == 0) {
            System.out.println("fizz-buzz");
        } else if (i % 3 == 0) {
            System.out.println("Fizz");
        } else if (i % 5 == 0) {
            System.out.println("buzz");
        }
    }
}
