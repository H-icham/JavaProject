package fr.campus.donjon.plateau;

import fr.campus.donjon.equipements.Bouclier;
import fr.campus.donjon.equipements.EquipementDefensif;
import fr.campus.donjon.equipements.Philtre;

import java.util.Random;

public class CasePotion implements InterfaceCase{
    private EquipementDefensif potion;

    public CasePotion() {
        this.potion = potion;
        Random number = new Random();
        int random = number.nextInt(2);
        if (random == 0){
            this.potion = new Philtre("Mandragore", 3);
        }else{
            this.potion = new Bouclier("Armure", 3);
        }
    }

    @Override
    public String toString() {
        return "CasePotion{" +
                "potion=" + potion +
                '}';
    }

    @Override
    public void Display() {
     new CasePotion();
    }
}
