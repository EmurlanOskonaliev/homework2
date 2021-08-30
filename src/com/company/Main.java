package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(additions(22, 20));
        System.out.println(additions(15, 5));
        System.out.println(additions(50, 25));
        System.out.println(additions(55, 30));
        System.out.println(additions(10, -30));

        System.out.println("");

        System.out.println("Задание на сообразительность");
        System.out.println(additions(generateRandomAge(), -10));
    }

    public static int generateRandomAge() {
        Random random = new Random();
        int age = random.nextInt(80);
        return age;
    }

    private static String additions(int age, int temp) {
        if ((age >= 20 && age <= 45 && temp >= -20 && temp <= 30)
                || (age < 20 && temp >= 0 & temp < 28)
                || (age > 45 && temp >= 10 && temp <= 25)) {
            return ("Можно идти гулять");
        } else {
            return ("Оставайтесь дома");
        }
    }
}
