package com.pb.ryzhuk.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        int counter = 0;
        Random random = new Random();
        int x = random.nextInt(101);
        int wruap;
        System.out.println("Вітаю вас у грі! Давай зіграємо у цифри? Вгадай цифру яку я придумала");

        do {
            counter++;
        System.out.println("Введіть цифру яку душа побажає");
        Scanner nicon = new Scanner(System.in);
        //wruap- число,яке ввів учасник
         wruap = nicon.nextInt();
         if(wruap==007) break;
        if (wruap == x) {
            System.out.println("Бінго, ви угадали");
        }
        if (wruap > x) {
            System.out.println("Загадана цифра менша ");
        }
        if (wruap < x) {
            System.out.println("Загадана цифра ,більша ");
        }
        }
        while (wruap != x) ;
        if (wruap!=007){
            System.out.println("Ви вгадали з " + counter + " спроби  ");
        }
        else  System.out.println("Game over");

    }
}

