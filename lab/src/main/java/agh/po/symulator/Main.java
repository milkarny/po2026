package agh.po.symulator;

public class Main {
    public static void main(String[] args) {
        Silnik silnik=new Silnik("Toyota", "1.8 VVT-i", 6500);
        SkrzyniaBiegów skrzynia=new SkrzyniaBiegów("Aisin", "M6", 6);
        Sprzęgło sprzęgło=new Sprzęgło("Sachs", "S100");
        Pozycja pozycja=new Pozycja(0, 0);

        Samochód auto=new Samochód(silnik, skrzynia, sprzęgło, pozycja);
        auto.wyswietlStan();

        auto.włącz();
        auto.wyswietlStan();

        auto.zwiększBieg();
        auto.zwiększBieg();
        auto.jedz(10, 5);
        auto.wyswietlStan();

        auto.zmniejszBieg();
        auto.wyswietlStan();

        auto.wyłącz();
        auto.wyswietlStan();

        Samochód auto2=new Samochód();
        auto2.wyswietlStan();
    }
}