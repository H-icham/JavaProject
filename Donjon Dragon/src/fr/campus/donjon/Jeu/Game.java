package fr.campus.donjon.Jeu;

import fr.campus.donjon.affichage.Menu;
import fr.campus.donjon.avatars.Personnage;
import fr.campus.donjon.plateau.*;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private Personnage perso;
    private Menu affichage;
    private ArrayList<InterfaceCase> plateau;
    private int positionPerso;

    public Game() {
        this.affichage = new Menu();
    }


    public void generatePlateau() {
        int taillePlateau = 64;
        positionPerso = -1;

        plateau = new ArrayList<>();
        for (int i =0; i<taillePlateau; i++){
            Random number = new Random();
            int random = number.nextInt(4);
            if (random == 0){
                plateau.add(new CaseVide());
            } else if (random == 1) {
                plateau.add(new CaseArme());
            } else if (random == 2) {
                plateau.add(new CasePotion());
            }else{
                plateau.add(new CaseEnnemi());
            }
        }

        plateau.add(new CaseVide());
        plateau.add(new CaseArme());
        plateau.add(new CasePotion());
        plateau.add(new CaseEnnemi());
        System.out.println(plateau);
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
                generatePlateau();
                startGame();
                break;
            } else if (menuChoice == 4) {
                break;
            } else {
                System.out.println("erreur, crée d'abord un personnage");
            }
        }
    }

    public void startGame() {
        this.positionPerso = -1; //RÉINITIALISER LA POSITION DU PERSO

        int cases = plateau.size(); // index est a 0
        //int cases = 64;
        System.out.println("le joueur est à la case 1");
        while (positionPerso < cases - 1) {
            int max = 6;
            //int max = 1;
            Random number = new Random();
            int dice = number.nextInt(max) + 1;
            positionPerso += dice;
            System.out.println(positionPerso);
            System.out.println(plateau.get(positionPerso));
        }

        Scanner playerChoice = new Scanner(System.in);
        System.out.println("Entrer votre choix N/Q");
        String choice = playerChoice.nextLine();
        System.out.println("votre choix est : " + choice);

        if (choice.equals("N")) {
            startGame();
        } else if (choice.equals("Q")) {
            return;
        } else {
//                while (!playerChoice.equals("N") && !playerChoice.equals("Q")) {
//                        System.out.println("Entrer votre choix N/Q");
//                        Scanner playerChoices = new Scanner(System.in);
//                        String choices = playerChoices.nextLine();
//                        System.out.println("votre choix est : " + choices);
//                }
        }
    }

    @Override
    public String toString() {
        return "Game{" +
                "perso=" + perso +
                ", affichage=" + affichage +
                ", plateau=" + plateau +
                '}';
    }

}

