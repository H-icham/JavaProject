package fr.campus.donjon.plateau;

import fr.campus.donjon.equipements.Arme;
import fr.campus.donjon.equipements.EquipementDefensif;
import fr.campus.donjon.equipements.EquipementOffensif;
import fr.campus.donjon.equipements.Sort;

import java.util.Random;

public class CaseArme implements InterfaceCase {
    private EquipementOffensif attack;

    public CaseArme() {
        this.attack = attack;
        Random number = new Random();
        int random = number.nextInt(2);
        if (random == 0){
            this.attack = new Arme("épée", 2);
        }else{
            this.attack = new Sort("invisiqué", 2);
        }
    }

    @Override
    public String toString() {
        return "CaseArme{" +
                "attack=" + attack +
                '}';
    }

    public EquipementOffensif getAttack() {
        return attack;
    }

    public void setAttack(EquipementOffensif attack) {
        this.attack = attack;
    }

    @Override
    public void Display() {
        new CaseArme();
    }
}


