package agh.po.symulator;

public class Pozycja {
    private double x;
    private double y;

    public Pozycja() {
        x=0;
        y=0;
    }
    public Pozycja(double x, double y) {
        this.x=x;
        this.y=y;
    }
    public void aktualizujPozycję(double deltaX, double deltaY) {
        x=x+deltaX;
        y=y+deltaY;
    }

    public void przemiesc(double dt, double V, Pozycja cel){
        if (cel!=null){
            double odleglosc=Math.sqrt(Math.pow(cel.x-x, 2)+Math.pow(cel.y-y, 2));
            if (odleglosc<=V*dt){
                x=cel.x;
                y=cel.y;
            } else{
                double dx=V*dt*(cel.x-x)/odleglosc;
                double dy=V*dt*(cel.y-y)/odleglosc;
                x=x+dx;
                y=y+dy;

            }
        }
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }

    public String getPozycja() {
        return "("+x+", "+y+")";
    }
}


