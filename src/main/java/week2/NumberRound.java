package week2;

import java.util.Scanner;

public class NumberRound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        double number = scanner.nextDouble();

        int roundUp = (int) Math.ceil(number);; //kendinden sonraki en yakın tam sayıya yuvarlar
        int tamSayi = (int) Math.round(number); //En yakın olduğu tam sayıya yuvarlar
        int roundDown = (int) Math.floor(number);; // kendinden önceki en yakın tam sayıya yuvarlar

        System.out.println("Aşağı yuvarlama: " + roundDown);


        System.out.println("Yukarı yuvarlama: " + roundUp);


        System.out.println("En yakın tam sayı değeri : " + tamSayi);
    }
}
