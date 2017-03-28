package prj;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

        System.out.println("Régles du jeu :\n \n"
        		+ "Bienvenu dans le jeu 4 mots pour 1 mots \n"
                + "Ton but est simple : déduire des quatres mots affichés l'idée ou le mot approprié.\n"
                + "Pour donner le mot exact, tu devras choisir parmi les lettres qui te sont proposées.\n"
                + "Les réponses peuvent être écrite en MAJUSCULE ou en miniscule peu importe. \n"
                + "Tu peux à tout moment interrompre ta partie en tapant le mot 'exit'.\n"
                + "Une aide te sera fournie en cas de difficulté.\n"
                + "A la fin de ta partie, ton score final te sera donné.\n");


        Joueur j1 = new Joueur();
        j1.setPseudo();

        Scanner scan = new Scanner(System.in);
        
        String player = j1.getPseudo();

        System.out.println("Bonjour " + player + "! Veux tu commencer le jeu ? (O/N)");
        String ouiOuNon = scan.nextLine();
        String oui = "o";
        String non = "n";

        // seul les reponse o ou n sont acceptées
        while (!oui.equalsIgnoreCase(ouiOuNon) && (!non.equalsIgnoreCase(ouiOuNon))) {
            System.out.println("\nSelectionner O ou N :");
            ouiOuNon = scan.nextLine();
        }

        Tab t1 = new Tab();
        if (ouiOuNon.equalsIgnoreCase(oui)) {
            t1.displayTab();
            if(t1.getAnswer().equalsIgnoreCase(non)){
            	System.out.println("Bien joué " + player + ", tu as totalisé un score de " + t1.getTotal() + " points!");
            	System.out.println("\nFin du jeu.");
            }
        }

        else {
            System.out.println("\nFin du jeu.");
        }
        scan.close();
    }
    

}
