package fr.campus.donjon.equipements;

public class EquipementOffensif {
    private String type; //équipement offensif par défaut (arme ou sort).
    //private String personnage; // à quel perso appartient t'il.

    public EquipementOffensif(String type) {
        this.type = type;
        //this.personnage = personnage;
    }

    @Override
    public String toString() {
        return "EquipementOffensif{" +
                "type='" + type + '\'' +
                '}';
    }
}
