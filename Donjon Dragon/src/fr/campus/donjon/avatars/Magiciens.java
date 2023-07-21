package fr.campus.donjon.avatars;

import fr.campus.donjon.equipements.*;

public class Magiciens extends Personnage{
    public Magiciens(String type, String nom) {
        super(type, nom);
        setNiveauDeVie(6);
        setForceAttaque(15);
        setEquipementOf(new Sort("invisiqué", 2));
        setEquipementDef(new Philtre("mandragore", 3));
    }
}
