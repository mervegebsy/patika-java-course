package week1;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Yıl Giriniz : ");
        int year = scanner.nextInt(); //kullanıcı tarafından girilen yıl
        //Artık yılda 100'ün katı olmadığı durumda  4'e bölünmesine bakılır veya 400'ün katı olması gerektiği için onun kontrölünü gerçekleştiriyorum.
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " bir artık yıldır !");
        } else {
            System.out.println(year + " bir artık yıl değildir !");
        }
    }
}
