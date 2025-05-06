package org.lesson.java.abstractAnimal;

import org.lesson.java.interfaces.Nuotanti;
import org.lesson.java.interfaces.Volanti;

public class Main {


    public static void faiVolare(Volanti animale) {
        animale.vola();
    }

    public static void faiNuotare(Nuotanti animale) {
        animale.nuota();
    }

    public static void main(String[] args) {
        Aquila marco = new Aquila();
        Cane giustino = new Cane();
        Delfino Fandonio = new Delfino();
        Passerotto cingo = new Passerotto();

        marco.dormi();
        marco.verso();
        marco.mangia();
        giustino.dormi();
        giustino.verso();
        giustino.mangia();
        Fandonio.dormi();
        Fandonio.verso();
        Fandonio.mangia();
        cingo.dormi();
        cingo.verso();
        cingo.mangia();

        Volanti aquila = new Aquila();
        faiVolare(aquila);

        Volanti passerotto = new Passerotto();
        faiVolare(passerotto);

        Nuotanti cane = new Cane();
        faiNuotare(cane);

        Nuotanti delfino = new Delfino();
        faiNuotare(delfino);
    }

}
