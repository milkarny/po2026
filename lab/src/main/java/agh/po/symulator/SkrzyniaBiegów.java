package agh.po.symulator;

public class SkrzyniaBiegów extends Komponent {
    private int aktualnyBieg;
    private int iloscBiegow;

    public SkrzyniaBiegów() {
        super();
        aktualnyBieg=0;
        iloscBiegow=5;
    }

    public SkrzyniaBiegów(String producent, String model, int iloscBiegow) {
        super(producent, model);
        this.iloscBiegow=iloscBiegow;
        aktualnyBieg=0;
    }

    public void zwiększBieg() {
        if(aktualnyBieg<iloscBiegow) {
            aktualnyBieg++;
        }
    }

    public void zmniejszBieg() {
        if(aktualnyBieg>0) {
            aktualnyBieg--;
        }
    }

    public void zerujBieg() {
        aktualnyBieg=0;
    }

    public int getAktualnyBieg() {
        return aktualnyBieg;
    }

    public int getIloscBiegow() {
        return iloscBiegow;
    }
}