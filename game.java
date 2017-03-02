package prj;

import java.util.Scanner;

public class game {

	public static void main(String[] args) {

		System.out.println("Règles du jeu :\n"
				+ "L'utilisateur doit déduire des quatres mot affiché l'idée ou le mot approprié.\n"
				+ "Pour donner le mot exact, il devra sélectionner parmi les lettres qui lui sont proposées.\n");
		Scanner scan = new Scanner(System.in);

		String speudo;
		int scoreTotal = 0;

		do {
			System.out.println("Entré votre Speudo :");
			speudo = scan.nextLine();
			// si le speudo est inférieur a 3 lettres, le speudo est redemandé
			while (speudo.length() < 3) {
				System.out.println("Votre Speudo est trop court. Veuillez entré votre Speudo :");
				speudo = scan.nextLine();
			}
		} while (speudo.length() < 3);

		System.out.println("Bonjour " + speudo + "! Veux tu commencer le jeu ? (O/N)");
		String ouiOuNon = scan.nextLine();
		String ouiOuNon2;
		String oui = "o";
		String non = "n";

		// seul les reponse o ou n sont accepté
		while (!oui.equalsIgnoreCase(ouiOuNon) && (!non.equalsIgnoreCase(ouiOuNon))) {
			System.out.println("\nSelectionner O ou N :");
			ouiOuNon = scan.nextLine();
		}

		// debut du jeu
		if (ouiOuNon.equalsIgnoreCase(oui)) {
			// choix du jeu au hasard
			do {
				int min = 0;
				// modifier la valeur suivant le nombre de possiblité de jeu
				// dans le tableau
				int max = 5;
				int r = min + (int) (Math.random() * ((max - min) + 1));
				// valeur qui détermine le choix du jeu, la ligne du tableau
				int choixJeu = r;

				// tableau chaque ligne correspond a un jeu dofférent
				// la cinquième valeur dune ligne correspond tounours a la
				// reponse
				// la sixieme valeur correspond toujour au nombre de lettre de
				// la réponse
				String jeu[][] = { { "Pomme", "Fraise", "Pêche", "Cerise", "Fruit", "5" },
						{ "Epinard", "Carrotte", "Pomme de terre", "Courge", "Légume", "6" },
						{ "France", "Russie", "Mexique", "Allemagne", "Pays", "4" },
						{ "Vert", "Violet", "Orange", "Blanc", "Couleur", "7" },
						{ "Tennis", "Natation", "Danse", "Athlétisme", "Sport", "5" },
						{ "Lion", "Guépard", "Panterre", "Crocodile", "Animal", "7" } };

				// case du tableau correspondant a la reponse du jeu
				String reponseJeu = jeu[choixJeu][4];
				String lettreJeu = jeu[choixJeu][5];

				// affiche les mot du jeu
				System.out.println("\n1." + jeu[choixJeu][0] + " 2." + jeu[choixJeu][1] + " 3." + jeu[choixJeu][2]
						+ " 4." + jeu[choixJeu][3]);
				System.out
						.println("\nLe mot est constitué de " + lettreJeu + " lettres parmis les lettre suivantes : ");
				System.out.println("Le mot est :");
				String reponse = scan.nextLine();

				int essaie = 0;

				// si la premiere reponse est bonne
				if (reponse.equalsIgnoreCase(reponseJeu)) {
					essaie++;
					System.out.println("Bravo vous avez trouver la bonne réponse!\n");
					if (essaie >= 3) {
						scoreTotal = scoreTotal + 1;
						System.out.println("Dommage tu as trouvé la réponse en plus de 3 essaies tu gagnes seulement 1 point");
					} else if (essaie == 2) {
						scoreTotal = scoreTotal + 2;
						System.out.println("Bravo tu as trouver la réponse en 2 essaies! tu gagnes 2 points.");
					} else if (essaie == 1) {
						scoreTotal = scoreTotal + 3;
						System.out.println("Bravo tu as trouver la réponse en 1 essaies! Tu gagnes 3 points.");
					}

					// si la premiere reponse est fausse
				} else {
					String reponse2;
					do {
						System.out.println("Mauvaise réponse! \nLe mot est :");
						reponse2 = scan.nextLine();
						essaie++;
						// si une des reponses suivantes est bonne
					} while (!reponse2.equalsIgnoreCase(reponseJeu));
					essaie++;
					if (essaie >= 3) {
						scoreTotal = scoreTotal + 1;
						System.out.println("Dommage tu as trouvé la réponse en plus de 3 essaies tu gagnes seulement 1 point");
					} else if (essaie == 2) {
						scoreTotal = scoreTotal + 2;
						System.out.println("Bravo tu as trouver la réponse en 2 essaies! tu gagnes 2 points.");
					} else if (essaie == 1) {
						scoreTotal = scoreTotal + 3;
						System.out.println("Bravo tu as trouver la réponse en 1 essaies! Tu gagnes 3 points.");
					}
				}
				System.out.println("Score : " + scoreTotal + "\n");

				System.out.println("Voulez vous rejouez ? (O/N)");
				ouiOuNon2 = scan.nextLine();

				while (!oui.equalsIgnoreCase(ouiOuNon2) && (!non.equalsIgnoreCase(ouiOuNon2))) {
					System.out.println("\nSelectionner O ou N :");
					ouiOuNon2 = scan.nextLine();
				}

			} while (ouiOuNon2.equalsIgnoreCase(oui));
			System.out.println("Bien joué " + speudo + " vous avez totalisé un score de " + scoreTotal + " points!");
			System.out.println("\nFin du jeu!");

		}

		else {
			System.out.println("\nFin du jeu.");
		}
		scan.close();

	}

}