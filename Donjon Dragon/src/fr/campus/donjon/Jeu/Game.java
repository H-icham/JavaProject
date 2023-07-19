package fr.campus.donjon.Jeu;

import fr.campus.donjon.affichage.Menu;
import fr.campus.donjon.avatars.Personnage;

import java.sql.SQLOutput;

public class Game {
    private Personnage perso;
    private Menu affichage;

    public Game() {
        this.affichage = new Menu();
    }

    public void enterMenuChoice() {
        while (true) {
            int menuChoice = affichage.makeChoice();

            if (menuChoice == 1) {
                this.perso = affichage.configPerso();
//                String nom = affichage.enterNameChoice();
//                String type = affichage.enterTypeChoice();
//                perso = new Personnage(type, nom);
//                System.out.println(perso);
            } else if (menuChoice == 2 && perso != null) {
                this.perso = affichage.configPerso();
//                affichage.enterNameChoice();
//                affichage.enterTypeChoice();
//                System.out.println(perso);
            } else if (menuChoice == 3 && perso != null) {
                // démarrer la partie
                affichage.startGame();
                break;
            } else if (menuChoice == 4) {
                break;
            } else {
                System.out.println("erreur, crée d'abord un personnage");
            }
        }
    }
};

