interface Spells {
    void castSpell();
}

class Wingardium_leviosa implements Spells {
    public void castSpell() {
        System.out.println("Levita un objeto cercano");
    }
}

class Oculus_reparo implements Spells {
    public void castSpell() {
        System.out.println("Repara anteojos dañados");
    }
}

class Expelliarmus implements Spells {
    public void castSpell() {
        System.out.println("Desarma el enemigo");
    }
}


class Expecto_Patronum implements Spells {
    public void castSpell() {
        System.out.println("Invoca un guardian magico");
    }
}


class Wizard {

    private Spells spells;

    public Wizard(Spells spells) {
        this.spells = spells;
    }

    public void doSpell() {
        spells.castSpell();
    }

    public void setSpell(Spells spells) {
        this.spells = spells;
    }
}


public class Main {

    public static void main(String[] args) {

        Wizard Harry_Potter = new Wizard(
                new Expecto_Patronum()
        );


        Wizard Ron_Weasley = new Wizard(
                new Expelliarmus()
        );
        Wizard Hermione_Granger = new Wizard(
                new Wingardium_leviosa()
        );

        System.out.println("Harry Potter");
        Harry_Potter.doSpell();
        
        System.out.println("Ron Weasly");
        Ron_Weasley.doSpell();
        
        System.out.println("Hermione Granger");
        Hermione_Granger.doSpell();

    
        System.out.println("Cambio en ejecucion");
        Hermione_Granger.setSpell(new Oculus_reparo());
        Hermione_Granger.doSpell();
    }

}