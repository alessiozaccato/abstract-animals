package org.lesson.java.abstractAnimal;

import org.lesson.java.interfaces.Volanti;

public class Aquila extends AbstactAnimal implements Volanti{

    @Override
    public void verso() {
       
        System.out.println("l'aquila stride");
    }

    @Override
    public void mangia() {
        System.out.println("l'aquila mangia carne");
        
    }

    @Override
    public void vola() {
        System.out.println("sto volando!!!");
    }

    

    

}
