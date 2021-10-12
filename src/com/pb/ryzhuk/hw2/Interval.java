package com.pb.ryzhuk.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner kinder = new Scanner(System.in);
        int karamelka;
        System.out.println("Введіть ціле число");
        karamelka = kinder.nextInt();
        if (karamelka >= 0 && karamelka <= 14) {
            System.out.println("Ваше число потрапило в інтервал  [0 -14]");
        } else if (karamelka >= 15 && karamelka <= 35) {
            System.out.println("Ваше число потрапило в інтервал  [15 - 35]");
        } else if (karamelka >= 36 && karamelka <= 50) {
            System.out.println("Ваше число потрапило в інтервал  [36 - 50]");
        } else if (karamelka >= 51 && karamelka <= 100) {
            System.out.println("Ваше число потрапило в інтервал  [51 - 100]");
        } else System.out.println("Ваше число потрапило в інший інтервал");
    }
}