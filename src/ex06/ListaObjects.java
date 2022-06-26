package ex06;

import java.util.ArrayList;


public class ListaObjects   {
	
	public static void main (String[] args) {
		
		ArrayList<Object> objectes=new ArrayList<Object>();
		ArrayList<Cadenes> cadenes =new ArrayList<Cadenes>();
		
		//Genera una llista  de cadenes i nombres
		
		objectes.add( "aaaaa");
		objectes.add( "aa");
		objectes.add(125);
		objectes.add( "aaa");
		objectes.add( "aaaaaa");
		objectes.add( 43);
		objectes.add( "aaaa");
		objectes.add(10);
		
		//Genera un array de Strings
		
		for(int i=0;i< objectes.size();++i) {
			if(objectes.get(i) instanceof String) {
				cadenes.add(new Cadenes(objectes.get(i).toString()));
			}
			
		}
		
		//Ordena de major a menor l'array de strings
		cadenes.sort((ob1,ob2)->ob1.compareTo(ob2));
		
		
		for(int i=0;i<cadenes.size();i++){
			System.out.println(cadenes.get(i).getCadena());
		}
	}	
	
}
