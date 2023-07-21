package fr.campus.donjon.equipements;

public abstract class EquipementDefensif {
    private String type; //équipement defensif (bouclier ou philtre).
    private int defenseplus;

    public EquipementDefensif(String type, int defenseplus){
        this.type = type;
        this.defenseplus = defenseplus;
    }

    @Override
    public String toString() {
        return "EquipementDefensif{" +
                "type='" + type + '\'' +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
