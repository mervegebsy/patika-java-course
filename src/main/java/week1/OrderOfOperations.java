package week1;

import java.util.Scanner;

public class OrderOfOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi = scanner.nextInt(); // kullanıcıdan sayı alınır
        System.out.println("İkinci sayıyı giriniz: ");// kullanıcıdan ikinci sayi alınır
        int sayi1 = scanner.nextInt();
        System.out.println("Üçüncü sayıyı giriniz: "); // üçüncü sayi alınır
        int sayi2 = scanner.nextInt();
        int sonuc = (sayi + sayi1) * (sayi2 - sayi1); // yapılacak işlemler yaptırılır
        System.out.println( "Sonuç: " + sonuc);
    }
}
