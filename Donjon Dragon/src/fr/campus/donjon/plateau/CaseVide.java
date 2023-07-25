package fr.campus.donjon.plateau;

public class CaseVide implements InterfaceCase{
    @Override
    public String toString() {
        return "CaseVide{}";
    }

    public CaseVide() {
        System.out.println("case vide, poursuiver le chemin");
    }

    @Override
    public void Display() {
   new CaseVide();
    }
}
