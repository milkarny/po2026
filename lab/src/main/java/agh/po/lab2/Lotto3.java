package agh.po.lab2;

import java.util.ArrayList;
import java.util.Random;

public class Lotto3 {

    public static ArrayList<Integer> losuj(Random random) {
        ArrayList<Integer> liczby=new ArrayList<>();
        while(liczby.size()<6) {
            int liczba=random.nextInt(49)+1;
            if(!liczby.contains(liczba)) {
                liczby.add(liczba);
            }
        }
        return liczby;
    }

    public static void main(String[] args) {
        Random random=new Random();
        ArrayList<Integer> typy=new ArrayList<>();
        for(int i=1;i<=6;i++) {
            typy.add(i);
        }

        long start=System.currentTimeMillis();
        long losowania=0;
        int trafienia=0;

        while(trafienia<6) {
            ArrayList<Integer> liczby=losuj(random);
            losowania++;
            trafienia=0;
            for(int i=0;i<typy.size();i++) {
                if(liczby.contains(typy.get(i))) {
                    trafienia++;
                }
            }
        }

        long koniec=System.currentTimeMillis();
        long czas=koniec-start;

        System.out.println("Twoje typy: "+typy);
        System.out.println("Liczba losowań: "+losowania);
        System.out.println("Czas: "+czas+" ms");
    }
}