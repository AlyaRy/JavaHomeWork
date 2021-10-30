package com.pb.ryzhuk.HW4;

import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
    static String enterText() {
        System.out.println("Введіть ваш текст");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    static String sort (String enteredText) {
        char[] sortedText = enteredText.toCharArray();
        Arrays.sort(sortedText);
        return new String(sortedText);
    }
    static void isAnagram (String enteredText1, String enteredText2) {
        if (sort(enteredText2).equals(sort(enteredText1))) {
            System.out.println("Ваші строки є анограмами");
        }
        else System.out.println("Ваші строки не є анограмами");
    }
    public static void main(String[] args) {
        String enteredText1 = enterText().replaceAll("[\\p{P}|\\s]","").toLowerCase();
        String enteredText2 = enterText().replaceAll("[\\p{P}|\\s]","").toLowerCase();
         isAnagram(enteredText1, enteredText2);
    }
}