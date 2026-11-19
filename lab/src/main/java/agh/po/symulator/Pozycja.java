package agh.po.symulator;

public class Pozycja {
    protected double x;
    protected double y;
    public void aktualnaPozycja(double deltaX, double deltaY){
        this.x=this.x+deltaX;
        this.y=this.y+deltaY;
    }
    public String getPozycja(){
        String pozX= String.valueOf(this.x);
        String pozY= String.valueOf(this.y);
        return pozX+' '+pozY;
    }

}
