package app;

import spells.OculusReparo;
import wizards.HarryPotter;
import wizards.HermioneGranger;
import wizards.RonWeasley;

public class Main {

    public static void main(String[] args) {
        HarryPotter harry = new HarryPotter();
        RonWeasley ron = new RonWeasley();
        HermioneGranger hermione = new HermioneGranger();

        System.out.println("hechizos iniciales");

        harry.doSpell();
        System.out.println();

        ron.doSpell();
        System.out.println();

        hermione.doSpell();
        System.out.println();

  
        System.out.println("cambio en ejecucion");

        System.out.println("Hermione cambia su hechizo a Oculus Reparo.");
        hermione.setSpell(new OculusReparo());
        hermione.doSpell();
        System.out.println();
        
        System.out.println("Harry cambia su hechizo a Oculus Reparo.");
        harry.setSpell(new OculusReparo());
        harry.doSpell();
        System.out.println();
    }
}
