package week1;

import java.util.Scanner;

public class Casting {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Bir tam sayı giriniz: ");
        int tamSayi = scanner.nextInt();
        System.out.println("Bir ondalıklı sayi giriniz: ");
        double ondalikliSayi = scanner.nextDouble();

        double sayi = (double) tamSayi; // ondalıklıya çevrildi
        int sayi2 = (int) ondalikliSayi; // tam sayıya çevrildi


        System.out.println( tamSayi + " ondalıklı sayıya dönüştürüldü: " + sayi);
        System.out.println( ondalikliSayi + " tam sayıya dönüştürüldü: " + sayi2);*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir tam sayı giriniz : ");
        int integer = scanner.nextInt();
        System.out.println("Bir ondalıklı sayı giriniz : ");
        double decimal = scanner.nextDouble();
        double decimalnumber = integer;
        System.out.println("Tam sayının ondalıklı sayıya dönüşümü : " + decimalnumber);
        int integer1 = (int) decimal;
        System.out.println("Ondalıklı sayının tam sayıya dönüşümü : " +integer1);
    }
}
