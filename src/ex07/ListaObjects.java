package ex07;

import java.util.ArrayList;


public class ListaObjects   {
	
	public static void main (String[] args) {
		
		ArrayList<Object> objectes=new ArrayList<Object>();
		ArrayList<Cadenes> cadenes =new ArrayList<Cadenes>();
		
		
		objectes.add( "aaaaa");
		objectes.add( "aa");
		objectes.add(125);
		objectes.add( "aaa");
		objectes.add( "aaaaaa");
		objectes.add( 43);
		objectes.add( "bbbcd");
		objectes.add( "Cbbcd");
		objectes.add( "cbbcd");
		objectes.add(10);
		objectes.add( "d");
		
		//Genera un array de Strings
		
		for(int i=0;i< objectes.size();++i) {
			if(objectes.get(i) instanceof String) {
				cadenes.add(new Cadenes(objectes.get(i).toString()));
			}
			
		}
		
		//Ordena de major amenor( canvia elètode compareTo)
		cadenes.sort((ob1,ob2)->ob1.compareTo(ob2));
	
		
		for(int i=0;i<cadenes.size();i++){
			System.out.println(cadenes.get(i).getCadena());
		}
		
		
			
		
	}	
	
}
