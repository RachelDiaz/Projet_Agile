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
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Joueur getJoueur(){
		return player;
	}
	
	public boolean register(Joueur reg) throws IOException{
		for(Joueur j : list){
				if(reg.getName().equals(j.getName()) && reg.getCode().equals(j.getCode())){
					System.out.println("ERREUR!!");
					return false;
				}
			}
		
		list.add(reg);
		sauve();
		return true;
	}
	
	public boolean login(Joueur log){
		for(Joueur j : list){
			if(log.getName().equals(j.getName()) && log.getCode().equals(j.getCode())){
				//log.setMoney(j.getMoney());
				System.out.println("OK");
				return true;
			}
		}
		System.out.println("ERREUR");
		return false;
				
	}
	
}
