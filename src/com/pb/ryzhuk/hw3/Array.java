package com.pb.ryzhuk.hw3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        // Создаем массив
        Scanner scanner = new Scanner(System.in);
        int Size = 10;
        int[] array = new int[Size];

        // Просим пользователя заполнить массив
        for (int i = 0; i < array.length; i++ ) {
            System.out.println("Введіть наступну циферку:");
            array[i] = scanner.nextInt();
        }

        // Выводим на эран массив
        System.out.println("Ваш масів:");
        for (int j : array) {
            System.out.println(j);
        }

        //Ведем подсчет суммы массива
        int resultSum = 0;
        for (int j : array) {
            resultSum = resultSum + j;
        }
        System.out.println("Сума елементів " + resultSum);

        //  Ведем подсчет позитивных чисел
        int countPositive = 0;
        for (int k : array) {
            if (k > 0) {
                countPositive++;
            }
        }
        System.out.println("ККількість позивиних спроб: " + countPositive);
        // Сортируем массив
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i <array.length-1; i++) {
                if (array[i] > array[i+1]) {
                    sorted = false;
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }
        // Выводим на эран отсортированный массив
        System.out.println("Ваш відсортований масів:");
        for (int j : array) {
            System.out.println(j);
        }
    }
}