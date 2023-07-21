package fr.campus.donjon.avatars;

import fr.campus.donjon.equipements.Arme;
import fr.campus.donjon.equipements.Bouclier;
import fr.campus.donjon.equipements.EquipementDefensif;
import fr.campus.donjon.equipements.EquipementOffensif;

public class Guerriers extends Personnage{

    public Guerriers(String type, String nom) {
        super(type, nom);
        setNiveauDeVie(10);
        setForceAttaque(10);
        setEquipementOf(new Arme("épée", 2));
        setEquipementDef(new Bouclier("armure", 3));
    }
}
