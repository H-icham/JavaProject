package fr.campus.donjon.equipements;

public class EquipementDefensif {
    private String type; //équipement defensif (bouclier ou philtre).
    //private String personnage; // à quel perso appartient t'il.

    public EquipementDefensif(String type){
        this.type = type;
        //this.personnage = personnage;
    }

    @Override
    public String toString() {
        return "EquipementDefensif{" +
                "type='" + type + '\'' +
                '}';
    }
}
