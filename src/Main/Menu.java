package Main;
import java.io.IOException;
import java.util.Scanner;

import Roulette.Plateau;
import joueur.Joueur;
import joueur.Save;
import machine_sous.PartieMachine;

/**
 * Classe de gestion du jeu
 * @author Team Casino
 *
 */
public class Menu {
	/**
	 * Selection du jeu
	 * @return nom du jeu
	 * @throws IOException 
	 */
	private Joueur joueur;
	
	public String nomdujeu(int nb) throws IOException {
		if(nb == 1) {
			return "BLACKJACK";
		} 
		if (nb == 2) {
			new Plateau(joueur);
			return "ROULETTE";
		} 
		if (nb == 3) {
			PartieMachine p=new PartieMachine();
			joueur.setMoney(p.partie(joueur));
			return "MACHINE A SOUS";
		}
		if(nb == 4){
			Save save=new Save();
			joueur = save.getJoueur();
			return "IDENTIFICATION/INSCRIPTION";
		}
		return null;
	}
	/**
	 * Création d'un menu
	 * @throws IOException 
	 */

	public Menu() throws IOException {
		Boolean b = false;
		int numerojeu;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("BIENVENUE AU CASINO ! ");
		nomdujeu(4);
		
		while(!b) {
			System.out.println("");
			System.out.println("BIENVENUE AU CASINO ! "
					+ "\n"
					+ "Veuillez choisir votre jeu ..." + "\n"
					+ "\n"
					+ "1 Blackjack" + "\n"
					+ "2 Roulette" + "\n"
					+ "3 Machine à sous" + "\n"
					+ "4 Quitter" + "\n"
					+ "\n"
					+ "Donnez le numéro du jeu concerné :"
					);
			numerojeu = scan.nextInt();
			if(numerojeu ==1 || numerojeu ==2 || numerojeu ==3){
				nomdujeu(numerojeu);
			} else if (numerojeu==4){
				System.out.println("Merci d'avoir joué dans notre casino, à bientôt !");
				Save save=new Save();
				save.maj(joueur);
				b = true;
				break;
			} else {
				System.out.println("ERREUR " 
						+ "\n" + "Ce choix n'est pas dans la liste." 
						+ "\n" + "Merci de choisir parmis les différents choix de la liste.");
			}
		}
			
	} 

}