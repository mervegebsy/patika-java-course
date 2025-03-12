package week2;

import java.util.Scanner;

public class PasswordControl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir şifre giriniz: ");
        String password = scanner.next();
        //kullanıcıdan şifre alınır

        if(password.length() >= 8 && !password.contains(" ")  && Character.isUpperCase(password.charAt(0)) && password.endsWith("?")){ //kontroller yapılıyor
            System.out.println("Geçerli şifre");
        }
        else {
            System.out.println("Şifre geçersizdir");
        }
    }
}
