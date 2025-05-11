package week1;

import java.util.Scanner;

public class MarketCheckout {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] urunler = {"Armut", "Elma", "Domates", "Muz", "Patlıcan"}; // ürünlerin listesi olusturuldu
        double[] kilos = new double[urunler.length]; // urunlerin uzunlugunda kg listesi olusturuldu
        double[] price = {2.14,3.67,1.11,0.95,5}; // fiyatlar listesi


        double summerPrice = 0;

        for (int i = 0; i < urunler.length; i++) {
            System.out.println(urunler[i] +" Kaç kilo ? : "); // her ürün için kaç kilo sorusu soruldu
            kilos[i] = scanner.nextDouble(); //kullanıcıdan kilo bilgisi alındı
            summerPrice += kilos[i] * price[i]; // her ürünün kilosuyla fiyatı çarpılıp toplam fiyata eklendi
        }

        System.out.println("Toplam tutar : " + summerPrice); // toplam fiyat yazdırıldı



    }
}
