package org.lesson.java.abstractAnimal;

import org.lesson.java.interfaces.Nuotanti;

public class Delfino extends AbstactAnimal implements Nuotanti{

    @Override
    public void verso() {
        System.out.println("il delfino stride");
    }

    @Override
    public void mangia() {
        System.out.println("il delfino mangia erba");
    }

    @Override
    public void nuota() {
        System.out.println("sto nuotando!!!");
    }

    
}
