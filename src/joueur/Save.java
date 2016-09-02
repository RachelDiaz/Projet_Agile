package joueur;

import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.google.gson.GsonBuilder;


public class Save {
	
	private Joueur player;
	private File fichier=new File("Ressources/ID.json");
	private FileReader reader= new FileReader(fichier);	
	private BufferedReader buffr;
	private List<Joueur> list;
		
	public Save() throws IOException{
		
		buffr=new BufferedReader(reader);
		String line=buffr.readLine();
		Joueur[] joueurs = new GsonBuilder().create().fromJson(line, Joueur[].class);
		list = new ArrayList<Joueur>(Arrays.asList(joueurs));
		buffr.close();
		
		
		
	}
	
	private void identification() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String name;
		String code;
		do{
			System.out.println("Identification :"+"\n");
			System.out.println("Veuillez entrer votre pseudo : ");
			name= scan.nextLine();
			System.out.println("Maintenant votre mot-de-passe : ");
			code= scan.nextLine();
		}while(!login(new Joueur(name,code)));
		System.out.println("Bienvenue "+player.getName()+"\n"+"Bon Jeu !");
	}

	private void registration() throws IOException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String name;
		String code;
		do{
			System.out.println("Enregistrement :"+"\n");
			System.out.println("Veuillez entrer votre pseudo : ");
			name= scan.nextLine();
			System.out.println("Maintenant votre mot-de-passe : ");
			code= scan.nextLine();
		}while(!register(new Joueur(name,code)));
		System.out.println("Enregistrement réussi !");
		System.out.println("Bienvenue "+player.getName()+"\n"+"Bon Jeu !");
	}

	private void sauve() throws IOException {
		String rep="[";
		for(Joueur j:list){
			rep+= new GsonBuilder().create().toJson(j)+",";
		}
		;
		rep=rep.substring(0, (rep.length()-1))+"]";
		FileWriter writer=new FileWriter(fichier);	
		PrintWriter buffw=new PrintWriter(writer);
		buffw.write(rep);
		buffw.close();
		
	}

	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Save frame = new Save();
					
					System.out.println(frame.getJoueur().getMoney());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Joueur getJoueur() throws IOException{
		boolean b=false;
		
		Scanner scan = new Scanner(System.in);
		
		while(!b){
			System.out.println("Choisir :"+"\n"
					+ "1/Identification"+"\n"
					+ "2/Enregistrement"+"\n"
					+ "Votre Choix :");
			int numerojeu = scan.nextInt();
			if(numerojeu==1){
				identification();
				b=true;
			}else if(numerojeu==2){
				registration();
				b=true;
			}else{
				System.out.println("Wesh t'es con tu sais pas choisir entre 1 et 2 boloss !");
			}
		}
		return player;
	}
	
	public boolean register(Joueur reg) throws IOException{
		for(Joueur j : list){
				if(reg.getName().equals(j.getName()) && reg.getCode().equals(j.getCode())){
					System.out.println("ERREUR!!");
					return false;
				}
			}
		player=reg;
		list.add(reg);
		sauve();
		return true;
	}
	
	public boolean login(Joueur log){
		for(Joueur j : list){
			if(log.getName().equals(j.getName()) && log.getCode().equals(j.getCode())){
				log.setMoney(j.getMoney());
				player=log;
				if(!player.resteMoney()){
					player.setMoney(200);
				}
				return true;
			}
		}
		System.out.println("ERREUR");
		return false;
				
	}
	
	public void maj(Joueur joueur) throws IOException {
		// TODO Auto-generated method stub
		for(Joueur j : list){
			if(joueur.getName().equals(j.getName()) && joueur.getCode().equals(j.getCode())){
				j.setMoney(joueur.getMoney());
			}
		}
		sauve();
	}
	
}
