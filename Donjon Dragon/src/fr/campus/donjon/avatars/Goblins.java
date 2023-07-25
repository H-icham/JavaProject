package fr.campus.donjon.avatars;

import fr.campus.donjon.equipements.Arme;

public class Goblins extends Personnage{
    public Goblins(String type, String nom) {
        super(type, nom);
        setNiveauDeVie(9);
        setForceAttaque(8);
        setEquipementOf(new Arme("arc", 2));
        //setEquipementDef(new Bouclier("armure", 3));
    }
}
