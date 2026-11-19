package agh.po.symulator;

public class Silnik extends Komponent{
    private int maxObroty;
    private int obroty;
    private String nazwa;
    private float waga;
    private double cena;

    public void uruchom(){
        this.obroty=1000;
    }
    public void zatrzymaj(){
        this.obroty=0;
    }
    public void zwiekszObroty(int delta){
        if(this.obroty+delta<=maxObroty)
            this.obroty=this.obroty+delta;
        else {this.obroty=this.maxObroty;}
    }
    public void zmniejszObroty(int delta){
        if(this.obroty-delta>-1000){
            this.obroty=obroty - delta;
        }
        else zatrzymaj();
    }
    public String getNazwa(){
        return this.nazwa;
    }
}
