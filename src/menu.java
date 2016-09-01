import java.util.Scanner;

/**
 * Classe de gestion du jeu
 * @author Team Casino
 *
 */
public class menu {

	/**
	 * Selection du jeu
	 * @return nom du jeu
	 */
	public String nomdujeu(int nb) {
		if(nb == 1) {
			return "BLACKJACK";
		} 
		if (nb == 2) {
			return "ROULETTE";
		} 
		if (nb == 3) {
			return "MACHINE A SOUS";
		}
		return null;
	}
	/**
	 * Création d'un menu
	 */
	public menu() {
		Boolean b = false;
		char c = (char)176;
		System.out.println("BIENVENUE AU CASINO ! " + "\n"
				+ c + c + c + c + c + c +"\n" 
				+ "Veuillez choisir votre jeu ..." + "\n"
				+ c + c + c + c + c + c +"\n"  
				+ "1 BLACKJACK" + "\n"
				+ "2 ROULETTE" + "\n"
				+ "3 MACHINE A SOUS" + "\n"
				+ c + c + c + c + c + c +"\n"
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

	public static void main(String[] args) {
		new menu();

	}

}
