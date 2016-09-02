package Roulette;

import Main.*;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class ChoixMise {
	private static Scanner scan;
	// Variable to check
	static boolean pair = false;
	static boolean impair = false;
	static boolean noir = false;
	static boolean rouge = false;
	static boolean zero = false;
	static boolean stmoitie = false;
	static boolean ndmoitie = false;
	static boolean stdouzaine = false;
	static boolean nddouzaine = false;
	static boolean rddouzaine = false;
	static boolean stcolonne = false;
	static boolean ndcolonne = false;
	static boolean rdcolonne = false;
	static int choixJoueur = 0;

	public ChoixMise() {
		/*
		 * int i = saisiMise(); int j = saisiPlace(); if (i == 0) { if (j == 0)
		 * { new Aleatoire(); } } i = 0; j = 0;
		 */
		System.out.println(Main.jacky.getMoney());
		int i = saisiMise();
		int j = saisiPlace();
		if (Main.jacky.getMoney() > 0) {
			if (i == 0 && j == 0) {
				new Aleatoire();
			} else if (i == 1 && j == 1) {
				System.out.println("Plus de jetons");
			}
		}

	}

	public static int mise;

	public static int saisiMise() {
		scan = new Scanner(System.in);
		System.out.println("Saisissez la mise que vous souhaitez jouer: ");
		System.out.println("1: 1");
		System.out.println("2: 5");
		System.out.println("3: 10");
		System.out.println("4: 25");
		System.out.println("5: 50");

		switch (scan.nextLine()) {
		case "1":
			mise = 1;
			if (mise == Main.jacky.getMoney()) {
				System.out.println("coucou");
				Main.jacky.Perte(1);
				return 0;
			}

			else if (mise > Main.jacky.getMoney()) {
				System.out.println("Il vous reste " + Main.jacky.getMoney() + " jetons");
				System.out.println("Vous n'avez pas assez de jetons, vous ne pouvez plus jouer");
				return 1;
			}
			Main.jacky.Perte(1);
			break;

		case "2":
			mise = 5;
			if (mise == Main.jacky.getMoney()) {
				System.out.println("coucou");
				Main.jacky.Perte(5);
				return 0;
			}

			else if (mise > Main.jacky.getMoney()) {
				System.out.println("Il vous reste " + Main.jacky.getMoney() + " jetons");
				System.out.println("Vous n'avez pas assez de jetons, vous ne pouvez plus jouer");
				return 1;
			}
			Main.jacky.Perte(5);
			break;

		case "3":
			mise = 10;
			if (mise == Main.jacky.getMoney()) {
				System.out.println("coucou");
				Main.jacky.Perte(10);
				return 0;
			}

			else if (mise > Main.jacky.getMoney()) {
				System.out.println("Il vous reste " + Main.jacky.getMoney() + " jetons");
				System.out.println("Vous n'avez pas assez de jetons, vous ne pouvez plus jouer");
				return 1;
			}
			Main.jacky.Perte(10);
			break;

		case "4":
			mise = 25;
			if (mise == Main.jacky.getMoney()) {
				System.out.println("coucou");
				Main.jacky.Perte(25);
				return 0;
			}

			else if (mise > Main.jacky.getMoney()) {
				System.out.println("Il vous reste " + Main.jacky.getMoney() + " jetons");
				System.out.println("Vous n'avez pas assez de jetons, vous ne pouvez plus jouer");
				return 1;
			}
			Main.jacky.Perte(25);
			break;

		case "5":
			mise = 50;
			if (mise == Main.jacky.getMoney()) {
				System.out.println("coucou");
				Main.jacky.Perte(50);
				return 0;
			}

			else if (mise > Main.jacky.getMoney()) {
				System.out.println("Il vous reste " + Main.jacky.getMoney() + " jetons");
				System.out.println("Vous n'avez pas assez de jetons, vous ne pouvez plus jouer");
				return 1;
			}
			Main.jacky.Perte(50);
			break;

		}
		/*
		 * if (mise == Main.jacky.getMoney()) { System.out.println("coucou");
		 * return 0; }
		 * 
		 * else if (mise > Main.jacky.getMoney()) { System.out.println(
		 * "Il vous reste " + Main.jacky.getMoney() + " jetons");
		 * System.out.println(
		 * "Vous n'avez pas assez de jetons, vous ne pouvez plus jouer"); return
		 * 1; }
		 */
		return 0;
	}

	public static int saisiPlace() {
		System.out.println("Où voulez-vous miser: ");
		System.out.println("P: Pair");
		System.out.println("I: Impair");
		System.out.println("N: Noir");
		System.out.println("R: Rouge");
		System.out.println("0: 0");
		System.out.println("M1: Première moitié");
		System.out.println("M2: Deuxième moitié");
		System.out.println("D1: Première douzaine");
		System.out.println("D2: Deuxième douzaine");
		System.out.println("D3: Troisième douzaine");
		System.out.println("C1: Première colonne");
		System.out.println("C2: Deuxième colonne");
		System.out.println("C3: Troisième colonne");
		System.out.println("Ou entrez un numéro entre 1 et 36");

		String g = scan.nextLine();
		Character gg = g.charAt(0);

		switch (g) {
		case "P":
			pair = true;
			break;
		case "I":
			impair = true;
			break;
		case "N":
			noir = true;
			break;
		case "R":
			rouge = true;
			break;
		case "0":
			zero = true;
			break;
		case "M1":
			stmoitie = true;
			break;
		case "M2":
			ndmoitie = true;
			break;
		case "D1":
			stdouzaine = true;
			break;
		case "D2":
			nddouzaine = true;
			break;
		case "D3":
			rddouzaine = true;
			break;
		case "C1":
			stcolonne = true;
			break;
		case "C2":
			ndcolonne = true;
			break;
		case "C3":
			rdcolonne = true;
			break;

		}
		if (gg.isDigit(g.charAt(0))) {
			int i = Integer.parseInt(g);
			if (i > 1 && i < 36) {
				choixJoueur = i;
			}
		}

		if (Main.jacky.getMoney() == 0) {
			return 1;
		}

		System.out.println("Voulez-vous placez d'autres jetons ? \n 1: Oui \n 2: Non, voir le résultat");

		switch (scan.nextLine()) {
		case "1":
			Main.jacky.Perte(mise);
			saisiPlace();

			break;

		case "2":
			break;
		}
		return 0;
	}

}