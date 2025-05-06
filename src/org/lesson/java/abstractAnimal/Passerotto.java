package org.lesson.java.abstractAnimal;

public class Passerotto extends AbstactAnimal {

    @Override
    public void verso() {
        System.out.println("il passerotto cinguetta");
    }

    @Override
    public void mangia() {
        System.out.println("il passerotto mangia semi");
    }

}
