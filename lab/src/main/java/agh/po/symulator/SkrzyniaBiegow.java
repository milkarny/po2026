package agh.po.symulator;

public class SkrzyniaBiegow {
    private int aktualnyBieg;
    private int iloscBiegow;
    private Sprzeglo sprzeglo;
    public void zwiekszBieg(){
        if(this.aktualnyBieg<this.iloscBiegow)this.aktualnyBieg++;
    }
    public void zmniejszBieg(){
        if(this.aktualnyBieg>0)this.aktualnyBieg--;
    }
    public SkrzyniaBiegow(int iloscBiegow){
        this.iloscBiegow=iloscBiegow;
        this.aktualnyBieg=0;
        this.sprzeglo.zwolnij();
    }
}
