package agh.po.lab2;

import java.util.ArrayList;
import java.util.Random;

public class Lotto2 {
    public static void main(String[] args) {
        Random random=new Random();
        ArrayList<Integer> liczby=new ArrayList<>();

        while(liczby.size()<6) {
            int liczba=random.nextInt(49)+1;
            if(!liczby.contains(liczba)) {
                liczby.add(liczba);
            }
        }

        ArrayList<Integer> typy=new ArrayList<>();
        for(int i=0;i<args.length;i++) {
            int typ=Integer.parseInt(args[i]);
            typy.add(typ);
        }

        int trafienia=0;
        for(int i=0;i<typy.size();i++) {
            if(liczby.contains(typy.get(i))) {
                trafienia++;
            }
        }

        System.out.println("Twoje typy: "+typy);
        System.out.println("Wylosowane liczby: "+liczby);
        System.out.println("Liczba trafień: "+trafienia);
    }
}