package week1;

import java.util.Scanner;

import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan matris boyutlarını al
        System.out.print("Matrisin satır sayısını girin: ");
        int satir = scanner.nextInt();
        System.out.print("Matrisin sütun sayısını girin: ");
        int sutun = scanner.nextInt();

        // Matris oluştur
        int[][] matris = new int[satir][sutun];

        // Kullanıcıdan matris elemanlarını al
        System.out.println("Matris elemanlarını girin:");
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print("Matris[" + i + "][" + j + "]: ");
                while (!scanner.hasNextInt()) { // Hatalı giriş kontrolü
                    System.out.println("Lütfen geçerli bir sayı girin!");
                    scanner.next(); // Yanlış girdiyi temizle
                }
                matris[i][j] = scanner.nextInt();
            }
        }

        // Transpoz matrisi oluştur
        int[][] transpoz = new int[sutun][satir];
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                transpoz[j][i] = matris[i][j];
            }
        }

        // Orijinal matrisi ekrana yazdır
        System.out.println("\nOrijinal Matris:");
        yazdirMatris(matris);

        // Transpoz matrisi ekrana yazdır
        System.out.println("\nTranspoz Matris:");
        yazdirMatris(transpoz);

        scanner.close();
    }

    // Matris yazdırma fonksiyonu
    public static void yazdirMatris(int[][] matris) {
        for (int[] satir : matris) {
            for (int eleman : satir) {
                System.out.print(eleman + " ");
            }
            System.out.println();
        }
    }
}


