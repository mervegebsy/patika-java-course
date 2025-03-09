package week1;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int number = scanner.nextInt();
        for(int i = number; i > 0; i--){ // sayıya kadar satırları kontrol ediyoruz
            for(int j =0; j < i; j++){ // yıldızları yazdırıyoruz
                System.out.print("*");
            }
            System.out.println(); // her seferinde alt satıra geçiyoruz


        }
    }
}
