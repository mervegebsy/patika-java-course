package week1;

import java.util.Scanner;

public class FlightTicketCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mesafeyi giriniz: ");
        double distance = scanner.nextDouble();
        System.out.println("Yaşınızı giriniz: ");
        int age = scanner.nextInt();
        System.out.println("Yolculuk tipinizi giriniz:( 1 => Tek Yön , 2 => Gidiş Dönüş) ");
        int travelType = scanner.nextInt();
        double price = distance * 0.10;
        if( distance > 0) {
            if (age < 12) {
                price = price / 2;
            } else if (age > 12 && age < 24) {
                price = price * 0.9;
            } else if (age > 65) {
                price = price * 0.7;

            }
        }
        else {
            System.out.println("Hatalı veri girişi yaptınız");
        }
        if (travelType ==2) {
            price = price * 0.8 *2;
            System.out.println(price);
        } else if (travelType == 1) {
            System.out.println(price);
        }else {
            System.out.println("Hatalı veri girişi yaptınız");
        }


    }

}
