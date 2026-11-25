package agh.po.symulator;

public class Sprzęgło extends Komponent {
    private boolean stanSprzęgła;

    public Sprzęgło() {
        super();
        stanSprzęgła=false;
    }

    public Sprzęgło(String producent, String model) {
        super(producent, model);
        stanSprzęgła=false;
    }

    public void wciśnij() {
        stanSprzęgła=true;
    }

    public void zwolnij() {
        stanSprzęgła=false;
    }

    public boolean getStanSprzęgła() {
        return stanSprzęgła;
    }
}