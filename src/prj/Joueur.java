package prj;

import java.util.Scanner;

public class Joueur {

    Scanner scan = new Scanner(System.in);
    String pseudo;

    //choix du pseudo par le joueur
    public String setPseudo(){
        do {
            System.out.println("Entrer votre Pseudo :");
            pseudo = scan.nextLine();
            // si le speudo est inf�rieur a 3 lettres, le pseudo est redemand�
            while (pseudo.length() < 3) {
                System.out.println("Votre Pseudo est trop court. Veuillez entrer votre Pseudo :");
                pseudo = scan.nextLine();
            }
        } while (pseudo.length() < 3);
        return pseudo;
    }

    //retourne le pseudo choisi pas le joueur
    public String getPseudo(){
        return pseudo;
    }

}
