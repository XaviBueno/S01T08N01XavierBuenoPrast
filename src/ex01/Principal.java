package ex01;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		String[] llistaCadenes= {"Hola","Avio","Pere","Josep"};
		ArrayList<String> cadenesAmbO =new ArrayList<String>();
		
		IStrings llista = (String[] cadenes, String  lletra)-> {
			ArrayList<String> sortida=new ArrayList<String>();
			for(int i=0; i< cadenes.length;i++) {
				
				if(cadenes[i].contains (lletra)) {
					sortida.add(cadenes[i]);
				}
			}
			return sortida;
			
		};
		
		for (String out: llista.stringMethods(llistaCadenes,"o")){
			System.out.println(out);
		}
	}
		

}
	
	
	



