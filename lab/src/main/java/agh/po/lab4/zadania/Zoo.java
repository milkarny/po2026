package agh.po.lab4.zadania;

import agh.po.lab4.animals.Animal;
import agh.po.lab4.animals.Dog;
import agh.po.lab4.animals.Parrot;
import agh.po.lab4.animals.Snake;
import java.util.Random;

public class Zoo {
    Animal[] animals=new Animal[100];

    public void fill() {
        Random random=new Random();
        for(int i=0;i<animals.length;i++) {
            int type=random.nextInt(3);
            if(type==0) {
                animals[i]=new Parrot("P"+i);
            } else if(type==1) {
                animals[i]=new Dog("D"+i);
            } else {
                animals[i]=new Snake("S"+i);
            }
        }
    }

    public int sumLegs() {
        int sum=0;
        for(int i=0;i<animals.length;i++) {
            sum=sum+animals[i].getLegs();
        }
        return sum;
    }

    public static void main(String[] args) {
        Zoo zoo=new Zoo();
        zoo.fill();
        System.out.println("Suma nog: "+zoo.sumLegs());

        for(int i=0;i<zoo.animals.length;i++) {
            Animal animal=zoo.animals[i];
            String description=animal.getDescription();
            System.out.println(description);
        }
    }
}