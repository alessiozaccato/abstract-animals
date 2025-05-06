package org.lesson.java.abstractAnimal;

import org.lesson.java.interfaces.Nuotanti;

public class Cane extends AbstactAnimal implements Nuotanti{

    @Override
    public void verso() {
        System.out.println("il cane abbaia");
    }

    @Override
    public void mangia() {
        System.out.println("il cane mangia carne");
    }

    @Override
    public void nuota() {
       System.out.println("sto nuotando!!!");
    }

    

}
