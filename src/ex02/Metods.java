package ex02;

import java.util.ArrayList;
//Mètode que busca strings que contingin  la o dins d'un array d'estrings
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
	
	//Mètode que busca strings que contingin  la o dins d'un array d'estrings i a més tinguin mé de 5 caracters
	
	public static ArrayList<String>   buscaOiBusca5  (String[] cadenes) {
		ArrayList<String> sortida=new ArrayList<String>();
		
		for(int i=0; i< cadenes.length;i++) {
			
			if(cadenes[i].contains ("o")&&(cadenes[i].length()>=5) ) {
				sortida.add(cadenes[i]);
			}
		}
		return sortida;
		
	}
}
