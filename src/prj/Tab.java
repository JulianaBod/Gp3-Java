package prj;

import java.util.Scanner;

public class Tab{
	Scanner scan = new Scanner(System.in);
	String ouiOuNon2;
	String oui = "o";
	String non = "n";

	int scoreTotal;
	int i;
	int count;
	int next = 0;
	String niveau9;

	public Tab() {}

	public void displayTab() {
		
		//Cr�ation d'un nouveau joueur
		//Joueur score = new Joueur();		
		
		//Boucle g�n�rale qui englobe le jeu
		do {
			
			//Choix du niveau par le joueur
			System.out.println("Pour commencer choisis ton niveau : 1/2/3/4");
			niveau9 = scan.nextLine();
			
			//Boucle permettant d'enchainer les 6 questions du niveau choisit
			for (int test = 0; test <=5; test++) {
				
				//Cr�ation d'un nouveau Level
				Level level = new Level();
				
				//Stockage de la m�thode qui affiche le tableau du niveau choisit
				String[][] tab = level.Afficher(niveau9);
				
				//Stockage de la m�thode qui contient la r�ponse � la question
				String reponse3 = level.ReponseJeu(tab,next);
				
				//Stockage de la m�thode qui contient le nombre de lettres de la r�ponse � la question
				String lettres = level.LettreJeu(tab,next);

				//Variable stockant la taille de la r�ponse
				int taille = reponse3.length();
				
				//Appel de la m�thoe affichant les informations sur le jeu en cours
				level.Aller(tab, lettres, next);
				
				//Affichage de la m�hode qui m�lange et affiche toutes les lettres random et celle de la r�ponse
				System.out.println(letters(reponse3, taille));

				//Prise en compte de la r�ponse du joueur
				System.out.println("Le mot est :");
				String reponse = scan.nextLine();

				//la variable essaie est un compteur qui permet de connaitre le nombre dessaie necessaire au joueur pour trouver la reponse
				int essaie = 0;

				//vérification de la premiere reponse entré par le joueur
				if (reponse.equalsIgnoreCase(reponse3)) {
					//si la reponse est bonne
					essaie++;

					//la premiere reponse est bonne le joueur gagne 3 points
					scoreTotal = scoreTotal + 3;
					System.out.println("Bravo tu as trouver la r�ponse en 1 essais! Tu gagnes 3 points.");

					next++;
				}

				else if (reponse.equalsIgnoreCase("exit")) {
					break;
				}

				//dans le cas ou la premiere reponse est fausse on créé une boucle pour redemander la reponse tant que le joueur na pas trouver
				else {
					String reponse2;
					do {
						System.out.println("Mauvaise r�ponse! \nLe mot est :");
						reponse2 = scan.nextLine();
						essaie++;
						count++;
						if (count >= 2) {
							System.out.println("Le mot commence par la lettre : " + reponse3.charAt(0));
						}
					} while (!reponse2.equalsIgnoreCase(reponse3));
					essaie++;
					//quand le joueur un trouver la bonne reponse on vérifie le nombre dessaie puis on calcule le score
					if (essaie == 2) {
						scoreTotal = scoreTotal + 2;
						System.out.println("Bravo tu as trouver la r�ponse en 2 essais! tu gagnes 2 points.");
					}else if (essaie >= 3) {
						scoreTotal = scoreTotal + 1;
						System.out.println("Dommage tu as trouv� la r�ponse en plus de 3 essais tu gagnes seulement 1 point.");
					}else if (essaie >=8){
						scoreTotal = scoreTotal + 0;
						System.out.println("Dommage tu as trouv� la r�ponse en plus de 8 essais tu ne gagnes pas de point.");
					}
					next++;
				}
				System.out.println("Score : " + scoreTotal + "\n");
			}

			System.out.println("Voulez vous rejouez ? (O/N)");
			ouiOuNon2 = scan.nextLine();

			while (!oui.equalsIgnoreCase(ouiOuNon2) && (!non.equalsIgnoreCase(ouiOuNon2))) {
				System.out.println("\nSelectionner O ou N :");
				ouiOuNon2 = scan.nextLine();
			}
		} while(ouiOuNon2.equalsIgnoreCase(oui));

	}

	public char[] letters(String reponse3, int taille) {
		char[] tab = new char[taille];
		char[] tab1 = new char[0];
		char temp;
		for (i = 0; i < taille; i++) {
			tab[i] = reponse3.charAt(i);
		}

		for (i = 0; i < (taille) - 1; i++) {
			int j = (int) (Math.random() * (i + 1));// j est une valeur
													// al�atoire
			temp = tab[i];
			tab[i] = tab[j];
			tab[j] = temp;
		}

		for (i = 0; i < tab1.length; i++) {
			int min1 = 97;
			int max1 = 122;
			int p = min1 + (int) (Math.random() * ((max1 - min1) + 1));
			System.out.print((char) p);
			System.out.print(tab[i]);
		}
		
	
			
		return tab1;
	}
	
	
	public int getTotal(){
		return scoreTotal;
	}
	
	public String getAnswer(){
		return ouiOuNon2;
	}
	
	public String getNiveau(){
		return niveau9;
	}
	
	public int getNext(){
		return next;
	}
}
