package fr.campus.donjon.plateau;

import fr.campus.donjon.avatars.Dragons;
import fr.campus.donjon.avatars.Goblins;
import fr.campus.donjon.avatars.Personnage;

import java.util.Random;

public class CaseEnnemi implements InterfaceCase{
    private Personnage ennemi;

    @Override
    public String toString() {
        return "CaseEnnemi{" +
                "ennemi=" + ennemi +
                '}';
    }

    public CaseEnnemi() {
        this.ennemi = ennemi;
        Random number = new Random();
        int random = number.nextInt(2);
        if (random == 0){
            this.ennemi = new Dragons("Dragon", "Smaug");
        }else {
            this.ennemi = new Goblins("Goblin", "Glamdrine");
        }
    }

    @Override
    public void Display() {
     new CaseEnnemi();
    }
}
