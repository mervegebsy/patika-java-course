package week1;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        double height = scanner.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz: ");
        double kg = scanner.nextDouble();
        double square = Math.pow(height,2);
        double bmi = kg / square;
        System.out.println("Vücut kitle indeksiniz : " + bmi);
    }
}
