package week1;

import java.util.Scanner;

public class PerfectNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == number){
            System.out.print(number + " bir mükemmel sayıdır");
        }
        else {
            System.out.print(number + " bir mükemmel sayı değildir");
        }
    }
}
