package ex01;

import java.util.ArrayList;

//Mètode que busca la o dins d'un array d'estrings

public class Metods {

	public static ArrayList<String>  buscaO(String[] cadenes) {
		ArrayList<String> sortida=new ArrayList<String>();
		
		for(int i=0; i< cadenes.length;i++) {
			
			if(cadenes[i].contains ("o")) {
				sortida.add(cadenes[i]);
				
			}
		}
		return sortida;
		
	}
	
	
}
