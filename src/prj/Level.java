package prj;

import java.util.Scanner;

public class Level {

	Scanner scan = new Scanner(System.in);

	// Méthode qui détermine le niveau et donc le tableau pour lequel le joueur
	// jouera
	public String[][] Afficher(String niveaux) {

		// Création d'un tableau à 2 dimansions vide de taille 6/6 pour stocker
		// les données plus tard
		

		// Insertion des données dans chaque tableau

		// Chaque ligne correspond a un jeu différent
		// La cinquième valeur d'une ligne correspond toujours a la
		// réponse
		// La sixieme valeur correspond toujours au nombre de lettres dans
		// la réponse
		String[][] jeuNiveau1 = { { "Pomme", "Fraise", "Pèche", "Cerise", "fruit", "5" },
				{ "Epinard", "Carrotte", "Pomme de terre", "Courge", "légume", "6" },
				{ "France", "Russie", "Mexique", "Allemagne", "pays", "4" },
				{ "Vert", "Violet", "Orange", "Blanc", "couleur", "7" },
				{ "Tennis", "Natation", "Danse", "Athlétisme", "sport", "5" },
				{ "Lion", "Guépard", "Panterre", "Crocodile", "animal", "6" } };

		String[][] jeuNiveau2 = { { "Nike", "Addidas", "Apple", "Dell", "marque", "6" },
				{ "Averse", "Pleuvoir", "Crachin", "Bruine", "pluie", "5" },
				{ "Frayeur", "Effroi", "Epouvante", "Apeurer", "peur", "4" },
				{ "Acteur", "Studio", "Filmer", "Cinéaste", "cinéma", "6" },
				{ "Vague", "Marin", "Marée", "Ecume", "mer", "3" },
				{ "Rivière", "Ruisseau", "Inondation", "Pluie", "eau", "3" } };

		String[][] jeuNiveau3 = { { "Scène", "Drame", "Coulisses", "Rôle", "théâtre", "7" },
				{ "Chapitre", "Préface", "Dédicace", "Page", "livre", "5" },
				{ "Journal", "Télévision", "Radio", "Internet", "media", "5" },
				{ "Enveloppe", "Date", "Signature", "Timbre", "lettre", "6" },
				{ "Classe", "Elève", "Instituteur", "Craie", "école", "5" },
				{ "Rire", "Chant", "Heureux", "Sourire", "bonheur", "7" } };

		String[][] jeuNiveau4 = { { "Vue", "Odorat", "Ouïe", "Toucher", "sens", "4" },
				{ "Menuisier", "Maçon", "Vendeur", "Professeur", "métier", "6" },
				{ ":)", "xD", ":p", "oO", "smiley", "6" },
				{ "George Clooney", "Hugh Jackman", "Mark Hamill", "Scarlett Johansson", "acteur", "6" },
				{ "Fanta", "Coca", "Orangina", "Pepsi", "soda", "4" },
				{ "Clafoutis", "Eclair", "Paris-Brest", "Macaron", "dessert", "7" } };
		
		String[][] jeu = new String[6][6];

		// Vérification du niveau choisit par l'utilisateur (valide ou non)
		while ((!niveaux.equalsIgnoreCase("1")) && (!niveaux.equalsIgnoreCase("2")) && (!niveaux.equalsIgnoreCase("3")) && (!niveaux.equalsIgnoreCase("4"))) {
			System.out.println("Error! Ce niveau n'existe pas!\n");
			System.out.println("Saisissez un niveau existant");
			niveaux = scan.nextLine();
		}
		
		if (niveaux.equalsIgnoreCase("1")) {
			jeu = jeuNiveau1;
		} else if (niveaux.equalsIgnoreCase("2")) {
			jeu = jeuNiveau2;
		} else if (niveaux.equalsIgnoreCase("3")) {
			jeu = jeuNiveau3;
		} else if (niveaux.equalsIgnoreCase("4")) {
			jeu = jeuNiveau4;
		}

		// Retourner le tableau à afficher
		return jeu;

	}

	public String[][] getJeu(String[][] jeu) {
		return jeu;
	}

	// Méthode qui récupère le mot correspondant à la réponse finale
	public String ReponseJeu(String[][] jeu, int next) {
		// Case du tableau correspondant a la réponse du jeu
		String reponseJeu = jeu[next][4];
		return reponseJeu;
	}

	// Méthode qui récupère le nombre de lettres composants la réponse
	public String LettreJeu(String[][] jeu, int next) {
		// Case du tableau correspondant au nombre de lettres de la réponse
		String lettreJeu = jeu[next][5];
		return lettreJeu;
	}

	// Méthode qui affiche les indices et le nombre de lettres de la réponse
	public void Aller(String[][] jeu, String lettreJeu, int next) {

		// affiche les mot du jeu
		System.out.println("\n1." + jeu[next][0] + " 2." + jeu[next][1] + " 3." + jeu[next][2] + " 4." + jeu[next][3]);
		System.out.print("\nLe mot est constitué de " + lettreJeu + " lettres parmis les lettre suivantes : ");

	}
}
