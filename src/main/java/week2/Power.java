package week2;

import java.util.Scanner;

public class Power {
    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;  // Her sayının 0. kuvveti 1'dir.
        }

        return base * power(base, exponent - 1);  // Recursive çağrı
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Taban değerini girin: ");
        int base = scanner.nextInt();

        System.out.print("Üs değerini girin: ");
        int exponent = scanner.nextInt();

        int result = power(base, exponent);
        System.out.println(base + "^" + exponent + " = " + result);

        scanner.close();
    }
}