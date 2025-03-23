package week3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ClosestNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(10);
        numbers.add(5);
        numbers.add(10);
        numbers.add(83);
        numbers.add(12);
        numbers.add(21);
        numbers.add(27);
        numbers.add(13);
        numbers.add(37);
        numbers.add(34);
        numbers.add(89);

        Collections.sort(numbers); // Listeyi küçükten büyüğe sıralıyoruz

        int minDiff = Integer.MAX_VALUE; // Karşılaştırma yapabilmek için  büyük bir değer belirlenir
        int number1 = 0;
        int number2 = 0;
        for(int i = 0; i < numbers.size()-1; i++){
            int diff = Math.abs(numbers.get(i) - numbers.get(i + 1)); // Mutlak fark hesaplanır
            if(diff < minDiff){ // Eğer bulunan fark, şu ana kadarki en küçük farktan küçükse
                minDiff = diff; // En küçük fark atanır
                 number1 = numbers.get(i);
                 number2 = numbers.get(i+1);
            }
        }
        System.out.println("En yakın sayılar: " + number1 + "," + number2); // en yakın sayılar yazdırılır


    }



}
