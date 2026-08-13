package wizards;

import spells.Spell;

public abstract class Wizard {

    private String name;
    private Spell spell;

    public Wizard(String name, Spell spell) {
        this.name = name;
        this.spell = spell;
    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }

    public void doSpell() {
        System.out.println(name + " lanza un hechizo:");
        spell.castSpell();
    }

    public String getName() {
        return name;
    }
}