package com.pb.ryzhuk.hm1;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NADO {
    public static void main(String[] args) {
        System.out.println("Введіть номер телефону в форматі: 380ХХХХХХХХХ");
        Scanner scanner = new Scanner(System.in);
        String phone = scanner.nextLine();
        if (isPhoneNumberCorrect(phone) == true) {
            String phoneNew = phone.replaceFirst("38", "9");
            System.out.println("Номер в новому форматі " + phoneNew);
        } else System.out.println("Номер введено в неправильному форматі");;
    }
    static boolean isPhoneNumberCorrect(String phone) {
        Pattern pattern = Pattern.compile("(^(\\380))?(\\d{12})$");
        Matcher matcher = pattern.matcher(phone);
        if (matcher.matches()) {
            return true;
        }
        return false;
    }
}