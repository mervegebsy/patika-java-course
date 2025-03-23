package week3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FindLetters {
    public static void main(String[] args) {
        ArrayList<String> letters = new ArrayList<>();
        letters.add("m");
        letters.add("e");
        letters.add("r");
        letters.add("v");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir harf giriniz: ");
        char harf = scanner.next().charAt(0);

        boolean found = false;
        for(int i = 0; i < letters.size(); i++){
            if(letters.get(i).charAt(0) == harf){
                letters.set(i,"Found");
                found = true;
                break;
            }
        }
        if(!found){
            letters.add(String.valueOf(harf));
        }
        System.out.println(letters);
    }
}
