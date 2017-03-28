package prj;

import java.util.Scanner;

public class Joueur {

    Scanner scan = new Scanner(System.in);
    String pseudo;

    public Joueur (){}

    public String setPseudo(){
        do {
            System.out.println("Entrer votre Pseudo :");
            pseudo = scan.nextLine();
            // si le speudo est inférieur a 3 lettres, le pseudo est redemandé
            while (pseudo.length() < 3) {
                System.out.println("Votre Pseudo est trop court. Veuillez entrer votre Pseudo :");
                pseudo = scan.nextLine();
            }
        } while (pseudo.length() < 3);
        return pseudo;
    }
    
    public String getPseudo(){
        return pseudo;
    }

}
