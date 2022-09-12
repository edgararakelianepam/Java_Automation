package com.epam.lections;

public class WordLength {
    public static void main(String[] args) {
        String word = new String();
        word = "";
        if (word.length() == 0) {
            System.out.println(0);
        } else {
            String lastWord = word.substring(word.lastIndexOf(" ") + 1);
            System.out.println(lastWord.length());
        }
    }
}

