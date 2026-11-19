package agh.po.symulator;

public class Samochód {
    private Silnik silnik;
    private SkrzyniaBiegow skrzynia;
    private boolean stan;
    private String model;
    private String nrRej;
    private int predkoscMax;

    public void wlacz(){
        this.silnik.uruchom();
    }

    public void wylacz() {
        this.silnik.zatrzymaj();
    }
}
