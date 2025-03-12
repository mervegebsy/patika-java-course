package week1;

import java.util.Scanner;

public class FlightTicketCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mesafeyi giriniz: ");
        double distance = scanner.nextDouble();
        System.out.print("Yaşınızı giriniz: ");
        int age = scanner.nextInt();
        System.out.print("Yolculuk tipinizi giriniz:( 1 => Tek Yön , 2 => Gidiş Dönüş: ) ");
        int travelType = scanner.nextInt();

        double price = distance * 0.10;

        if(distance > 0 && age > 0 && (travelType == 1 || travelType == 2)){ //kullanıcıdan istenenlerin kontrolü
            if (age < 12) { // yaşa göre indirim tarifelerinin kontrolü
                price = price / 2;
            } else if (age > 12 && age < 24) {
                price = price * 0.9;
            } else if (age > 65) {
                price = price * 0.7;

            }
            if (travelType == 2) { // yolculuk tipine göre indirim tarifesi kontrolü
                price = price * 0.8 *2;
                System.out.println(price);
            } else if (travelType == 1) {
                System.out.println(price);
            }
        }
        else { // girilen veriler yanlışsa
            System.out.println("Hatalı veri girişi yaptınız");
        }


    }

}
