package com.pb.ryzhuk.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner bulochki= new Scanner(System.in);
        int operand1;
        int operand2;
        System.out.println("Введіть циферку №1");
         operand1 = bulochki.nextInt();
        System.out.println("Введіть циферку №2");
         operand2= bulochki.nextInt();
        String sign;
        System.out.println("Введіть знак ");
        sign=bulochki.next();
        int result;
        switch(sign){
            case "+":
                result=operand1 + operand2;
                System.out.println(result);
                break;
            case "-":
                result=operand1 - operand2;
                System.out.println(result);
                break;
            case "/":
                if (operand2 == 0) {System.out.println ("Ти шо  сокіабле?");}
                else{
                result=operand1 / operand2;
                System.out.println(result);}
                break;
            case "*":
                result=operand1 * operand2;
                System.out.println(result);
                break;
            default:
                System.out.println("Сокіабле?");
                break;
        }
    }
}
