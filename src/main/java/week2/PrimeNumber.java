package week2;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();
        scanner.close();

        if(isPrime(number, number/2)){
            System.out.println(number + " sayısı ASALDIR");
        }
        else {
            System.out.println(number + " sayısı ASAL DEĞİLDİR");
        }


    }
    public static boolean isPrime(int number , int number2) { //bu metod için 2 tane parametre alıyorum
        if (number < 2) {
            return false; // sayı 2den küçük olmamalı asal olması için
        }
        if (number2 == 1) { // 1'e kadar gidiyorum
            return true;
        }
        if (number % number2 == 0) { // kalansız bölünüyor mu kontrolü yapıyorum
            return false;
        }
        return isPrime(number, number2 - 1); // number2 bir eksiltip tekrar deniyorum
    }
}
