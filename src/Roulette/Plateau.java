package Roulette;

import java.awt.Menu;
import java.util.Scanner;

import Main.Main;
import joueur.Joueur;

public class Plateau {
	private int LARG = 3;
	private int LONG = 12;
	private Joueur joueur;
	public Plateau(Joueur joueur) {
		this.joueur=joueur;
		boolean boo = false;
		Affichage();
		new ChoixMise(joueur);
		while (!boo) {
			if(joueur.getMoney() > 0){
				System.out.println("1: Rejouer");
				System.out.println("2: Voir mon compte");
				System.out.println("3: Quitter");
				Scanner scanner = new Scanner(System.in);

				switch (scanner.nextLine()) {
				case "1": new ChoixMise(joueur);
				break;
				case "2":
					System.out.println("Votre compte est de: " + joueur.getMoney());
					new ChoixMise(joueur);
					break;
				case "3":
					new Menu();
					boo = true;
					break;
				}
			}
			else
				boo = true;
		}
		System.out.println("Vous n'avez plus de jetons");

	}



	public void Affichage() {
		int x = 1;
		System.out.println("                    ROULETTE                     ");
		System.out.println("-------------------------------------------------");
		System.out.println("      |                0                |");
		for (int i = 0; i < LONG; i++) {
			System.out.println("-------------------------------------------------");
			for (int j = 0; j < LARG; j++) {
				if (x == 4) {
					System.out.print("PASSE");
				}

				if (x == 16) {
					System.out.print("PAIR ");
				}

				if (x == 28) {
					System.out.print("NOIR ");
				}

				if (x != 4 && x != 16 && x != 28) {
					System.out.print("     ");
				}
				if (x > 0 && x < 10) {
					System.out.print(" |  " + x + "  | ");
					x++;
				} else {
					System.out.print(" | " + x + "  | ");
					x++;
				}
				if (x == 7) {
					System.out.print("MANQUE");
				}
				if (x == 19) {
					System.out.print("IMPAIR");
				}
				if (x == 31) {
					System.out.print("ROUGE");
				}
			}
			System.out.println();
		}
		System.out.println("-------------------------------------------------");
		System.out.println("Rouge: 1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36");
		System.out.println("Noir: 2, 4, 6, 8, 10, 11, 13, 15, 17, 20, 22, 24, 26, 28, 29, 31, 33, 35");
	}
	
	public Joueur getJoueur(){
		return joueur;
	}
}
