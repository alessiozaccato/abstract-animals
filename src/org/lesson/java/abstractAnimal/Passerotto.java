package org.lesson.java.abstractAnimal;

import org.lesson.java.interfaces.Volanti;

public class Passerotto extends AbstactAnimal implements Volanti{

    @Override
    public void verso() {
        System.out.println("il passerotto cinguetta");
    }

    @Override
    public void mangia() {
        System.out.println("il passerotto mangia semi");
    }

    @Override
    public void vola() {
        System.out.println("sto volando!!!");
    }

    

}
