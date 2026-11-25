package agh.po.symulator;

public class Samochód {
    private Silnik silnik;
    private SkrzyniaBiegów skrzynia;
    private Sprzęgło sprzęgło;
    private Pozycja pozycja;
    private boolean wlaczony;

    public Samochód() {
        silnik=new Silnik();
        skrzynia=new SkrzyniaBiegów();
        sprzęgło=new Sprzęgło();
        pozycja=new Pozycja();
        wlaczony=false;
    }

    public Samochód(Silnik silnik, SkrzyniaBiegów skrzynia, Sprzęgło sprzęgło, Pozycja pozycja) {
        this.silnik=silnik;
        this.skrzynia=skrzynia;
        this.sprzęgło=sprzęgło;
        this.pozycja=pozycja;
        wlaczony=false;
    }

    public void włącz() {
        silnik.uruchom();
        wlaczony=true;
    }

    public void wyłącz() {
        silnik.zatrzymaj();
        skrzynia.zerujBieg();
        wlaczony=false;
    }

    public void zwiększBieg() {
        if(wlaczony) {
            sprzęgło.wciśnij();
            skrzynia.zwiększBieg();
            sprzęgło.zwolnij();
        }
    }

    public void zmniejszBieg() {
        if(wlaczony) {
            sprzęgło.wciśnij();
            skrzynia.zmniejszBieg();
            sprzęgło.zwolnij();
        }
    }

    public void jedz(double deltaX, double deltaY) {
        if(wlaczony&&skrzynia.getAktualnyBieg()>0) {
            pozycja.aktualizujPozycję(deltaX, deltaY);
            silnik.zwiekszObroty(500);
        }
    }

    public void wyswietlStan() {
        System.out.println("Silnik: "+silnik.getProducent()+" "+silnik.getModel()+", obroty: "+silnik.getObroty()+"/"+silnik.getMaxObroty());
        System.out.println("Skrzynia: "+skrzynia.getProducent()+" "+skrzynia.getModel()+", bieg: "+skrzynia.getAktualnyBieg()+"/"+skrzynia.getIloscBiegow());
        System.out.println("Sprzęgło: "+sprzęgło.getProducent()+" "+sprzęgło.getModel()+", wciśnięte: "+sprzęgło.getStanSprzęgła());
        System.out.println("Pozycja: "+pozycja.getPozycja());
        System.out.println("Włączony: "+wlaczony);
        System.out.println();
    }

    public Silnik getSilnik() {
        return silnik;
    }

    public SkrzyniaBiegów getSkrzynia() {
        return skrzynia;
    }

    public Sprzęgło getSprzęgło() {
        return sprzęgło;
    }

    public Pozycja getPozycja() {
        return pozycja;
    }
}