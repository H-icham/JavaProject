package fr.campus.donjon.avatars;

import fr.campus.donjon.equipements.EquipementDefensif;
import fr.campus.donjon.equipements.EquipementOffensif;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Personnage {
   private String type;
    private String nom;
    private int niveauDeVie;
    private int forceAttaque;
    private EquipementOffensif equipementOf;
    private EquipementDefensif equipementDef;

    public Personnage(String type, String nom){
        this.type = type;
        this.nom = nom;

        if (type.equals("guerrier")){
            this.niveauDeVie = 10;
            this.forceAttaque = 10;
            this.equipementOf = new EquipementOffensif("arme");
            this.equipementDef = new EquipementDefensif("bouclier");
        } else if (type.equals("magicien")){
            this.niveauDeVie = 6;
            this.forceAttaque = 15;
            this.equipementOf = new EquipementOffensif("sort");
            this.equipementDef = new EquipementDefensif("philtre");
        }else{
            System.out.println("erreur veullier saisir guerrier ou magicien");
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNiveauDeVie() {
        return niveauDeVie;
    }

    public void setNiveauDeVie(int niveauDeVie) {
        this.niveauDeVie = niveauDeVie;
    }

    public int getForceAttaque() {
        return forceAttaque;
    }

    public void setForceAttaque(int forceAttaque) {
        this.forceAttaque = forceAttaque;
    }

    public EquipementOffensif getEquipementOf() {
        return equipementOf;
    }

    public void setEquipementOf(EquipementOffensif equipementOf) {
        this.equipementOf = equipementOf;
    }

    public EquipementDefensif getEquipementDef() {
        return equipementDef;
    }

    public void setEquipementDef(EquipementDefensif equipementDef) {
        this.equipementDef = equipementDef;
    }

    @Override
    public String toString() {
        return "Personnage{" +
                "type='" + type + '\'' +
                ", nom='" + nom + '\'' +
                ", niveauDeVie=" + niveauDeVie +
                ", forceAttaque=" + forceAttaque +
                ", equipementOf=" + equipementOf +
                ", equipementDef=" + equipementDef +
                '}';
    }
}


