package agh.po.lab2;

import java.util.ArrayList;
import java.util.Random;

public class Lotto {
    public static void main(String[] args) {
        Random random=new Random();
        ArrayList<Integer> liczby=new ArrayList<>();

        while(liczby.size()<6) {
            int liczba=random.nextInt(49)+1;
            if(!liczby.contains(liczba)) {
                liczby.add(liczba);
            }
        }

        System.out.println(liczby);
    }
}