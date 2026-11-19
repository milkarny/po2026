package agh.po.symulator;

public class Sprzeglo extends Komponent{
    private boolean stanSprzegla;
    public void wcisnij (){
        this.stanSprzegla=true;
    }
    public void zwolnij(){
        this.stanSprzegla=false;
    }
}
