package fr.campus.donjon.equipements;

public abstract class EquipementOffensif {
    private String type; //équipement offensif par défaut (arme ou sort).
    private int attackbonus;

    public EquipementOffensif(String type, int attackbonus) {
        this.type = type;
        this.attackbonus = attackbonus;
    }

    @Override
    public String toString() {
        return "EquipementOffensif{" +
                "type='" + type + '\'' +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAttackbonus() {
        return attackbonus;
    }

    public void setAttackbonus(int attackbonus) {
        this.attackbonus = attackbonus;
    }
}
