package com.epam.lections;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(compareNumbers(121));
    }
    public static boolean compareNumbers(int num1) {
        if (num1 >= 0) {
            String str_num = String.valueOf(num1);
            StringBuilder builder = new StringBuilder(str_num);
            builder.reverse();
            int num2 = Integer.parseInt(builder.toString());
            if (num1 == num2) {
                return true;
            }
        }
        return false;
    }
}
