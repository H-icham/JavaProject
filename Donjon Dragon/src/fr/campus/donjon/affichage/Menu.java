package fr.campus.donjon.affichage;

import fr.campus.donjon.avatars.Personnage;

import java.util.Random;
import java.util.Scanner;

public class Menu {




    public String enterNameChoice() {
        Scanner nameChoice = new Scanner(System.in);
        System.out.println("Entrer votre nom");
        String nom = nameChoice.nextLine();
        System.out.println("Ton nom est : " + nom);
        return nom;
    }

    public String enterTypeChoice() {
        Scanner typeChoice = new Scanner(System.in);
        System.out.println("Entrer votre type");
        String type = typeChoice.nextLine();
        while(!type.equals("guerrier") && !type.equals("magicien")){
            System.out.println("Veuiller entrer guerrier ou magicien");
             type = typeChoice.nextLine();
        }
        System.out.println("Ton type est : " + type);
        return type;
    }

    public int makeChoice() {
        System.out.println("1: création du personnage");
        System.out.println("2: modifier le personnage");
        System.out.println("3: démarrer la partie");
        System.out.println("4: fin de la partie");
        Scanner terminale = new Scanner(System.in);
        int choice = terminale.nextInt();
        return choice;
    }


    public Personnage configPerso() {
        String nom = enterNameChoice();
        String type = enterTypeChoice();
        Personnage perso = new Personnage(type, nom);
        System.out.println(perso);
        return perso;
    }


    public void startGame() {
            int positionJoueur = 1; //position du joueur (1 à 64)
            int cases = 64; // index est a 0
            System.out.println("le joueur est à la case 1");

            while (positionJoueur < cases) {
                int max = 6;
                Random number = new Random();
                int dice = number.nextInt(max) + 1;
                positionJoueur += dice;
                System.out.println(positionJoueur);
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

                //}
            }
    };

};

