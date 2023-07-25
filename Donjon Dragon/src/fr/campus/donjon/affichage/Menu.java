package fr.campus.donjon.affichage;

import fr.campus.donjon.avatars.Guerriers;
import fr.campus.donjon.avatars.Magiciens;
import fr.campus.donjon.avatars.Personnage;

import java.sql.SQLOutput;
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
        if(type.equals("guerrier")){
            Guerriers perso = new Guerriers(type, nom);
            System.out.println(perso);
            return perso;
        }else{
            Magiciens perso = new Magiciens(type, nom);
            System.out.println(perso);
            return perso;
        }
    }
}

