package Main;
import java.io.IOException;
import java.util.Scanner;

import Roulette.Plateau;
import joueur.Joueur;
import joueur.Save;

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
			new Plateau();
			return "ROULETTE";
		} 
		if (nb == 3) {
			return "MACHINE A SOUS";
		}
		if(nb == 4){
			Save save=new Save();
			save.getJoueur();
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
		System.out.println("BIENVENUE AU CASINO ! "
				+ "\n"
				+ "Veuillez choisir votre jeu ..." + "\n"
				+ "\n"
				+ "1 BLACKJACK" + "\n"
				+ "2 ROULETTE" + "\n"
				+ "3 MACHINE A SOUS" + "\n"
				+ "4 IDENTIFICATION/INSCRIPTION"+"\n"
				+ "\n"
				+ "Donnez le numéro du jeu concernée :"
				);
		//try {
		Scanner scan = new Scanner(System.in);
		int numerojeu = scan.nextInt();
		//} catch (NumberFormatException nf) {
		/*while(!b) {
				if(numerojeu ==1 || numerojeu ==2 || numerojeu ==3){
					System.out.println("\n"+"Vous avez choisis le jeu numéro : " + numerojeu + "\n" +
						"Votre jeu de " + nomdujeu(numerojeu) + " va commencer ...");
					b = true;
					break;
				} else {
					System.out.println("ERREUR " 
						+ "\n" + "Le jeu saisis n'est pas bon, merci de ressayer ..." 
						+ "\n" + "Donnez le numero du jeu concernée :");
					numerojeu = scan.nextInt();
				}
			}
		}*/



		while(!b) {
			if(numerojeu ==1 || numerojeu ==2 || numerojeu ==3 ){
				System.out.println("\n"+"Vous avez choisis le jeu numéro : " + numerojeu + "\n" +
						"Votre jeu de " + nomdujeu(numerojeu) + " va commencer ...");
				b = true;
				break;
			} else if(numerojeu==4) {
				nomdujeu(numerojeu);
				break;
				
			}else{
				System.out.println("ERREUR " 
						+ "\n" + "Le jeu saisis n'est pas bon, merci de ressayer ..." 
						+ "\n" + "Donnez le numero du jeu concernée :");
				numerojeu = scan.nextInt();
			}
		}

	}

	/*		while(!b) {
				if(scan.equals("1") || scan.equals("2") || scan.equals("3")){
					System.out.println("\n"+"Vous avez choisis le jeu numéro : " + scan + "\n" +
						"Votre jeu de " + (scan) + " va commencer ...");
					b = true;
					break;
				} else {
					System.out.println("ERREUR " 
						+ "\n" + "Le jeu saisis n'est pas bon, merci de ressayer ..." 
						+ "\n" + "Donnez le numero du jeu concernée :");
				}
			}*/


}