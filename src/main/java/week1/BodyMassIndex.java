package week1;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        double height = scanner.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz: ");
        double kg = scanner.nextDouble();

        double bmi = kg / (height * height); // vücut kitle indeksi formülü kg / boyun karesi
        System.out.println("Vücut kitle indeksiniz : " + bmi);
    }
}
