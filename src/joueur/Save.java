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
	
	Joueur player;
	File fichier=new File("Ressources/ID.json");
	int indicePlayer;
	FileReader reader= new FileReader(fichier);	
	BufferedReader buffr;
	Joueur fantome;
		
	public Save(String name, String code) throws IOException{
		fantome=new Joueur(name,code);
		boolean ok = false;		
		buffr=new BufferedReader(reader);
		String line=buffr.readLine();
		System.out.println(line);
		
		Joueur[] joueurs = new GsonBuilder().create().fromJson(line, Joueur[].class);
		List<Joueur> list = new ArrayList<Joueur>(Arrays.asList(joueurs));
		for(Joueur j : list){
			if(j.getName()==fantome.getName() && j.getCode()==fantome.getCode()){
				player=j;
				ok=true;
			}
		}
		if(ok!=true){
			list.add(fantome);
		}
		sauve(list);
		
//		String[] diffPlayer=(line.split("\\},\\{"));
//		while(ok!=true && i<diffPlayer.length){
//			if(diffPlayer[i].contains(name) && diffPlayer[i].contains(code)){
//				player=new GsonBuilder().create().fromJson(diffPlayer[i], Joueur.class);
//				ok=true;
//				indicePlayer=i;
//			}
//			System.out.println(i);
//			i++;
//		}
//		
//		if(ok==false){
//			indicePlayer=diffPlayer.length;
//			player=new Joueur(name,code);
//			
//			buffw.write((line.substring(0, line.length()-1))+','+new Gson().toJson(player)+']');
//			
//		}
//		buffw.close();
//		buffr.close();
//		writer.close();
		reader.close();
	}
	
	private void sauve(List<Joueur> list) throws IOException {
		String rep="[";
		for(Joueur j:list){
			rep+= new GsonBuilder().create().toJson(j)+",";
		}
		;
		rep=rep.substring(0, (rep.length()-1))+"]";
		System.out.println(rep);
		FileWriter writer=new FileWriter(fichier);	
		PrintWriter buffw=new PrintWriter(writer);
		buffw.write(rep);
		buffw.close();
		
	}

	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Save frame = new Save("Jeanne","oui");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	
}
