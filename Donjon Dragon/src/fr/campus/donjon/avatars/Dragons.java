package fr.campus.donjon.avatars;

import fr.campus.donjon.equipements.Arme;

public class Dragons extends Personnage{
    public Dragons(String type, String nom) {
        super(type, nom);
        setNiveauDeVie(12);
        setForceAttaque(13);
        setEquipementOf(new Arme("boule de feu", 4));
        //setEquipementDef(new Bouclier("armure", 3));
    }
}
