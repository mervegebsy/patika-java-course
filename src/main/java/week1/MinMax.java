package week1;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi giriniz : ");
        int sayi = scanner.nextInt();
        int sum = 0;
        int counter = 0;

        for(int i= 1; i < sayi; i++){
            if(i % 3 == 0 && i % 4 == 0){
                sum = sum + i; // bölünen sayıların toplamı
                counter++; // 3 e 4 e bölünen sayıların adedini tutmak için counter koydum
            }
        }

        System.out.println(" 3'e ve 4'e bölünenlerin ortalaması: " + sum / counter); // ortalama hesaplaması yazdırıldı

    }
}
