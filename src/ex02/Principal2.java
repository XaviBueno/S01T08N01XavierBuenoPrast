package ex02;

import ex01.IStrings;



public class Principal2 {
	
	
		public static void main(String[] args) {

			String[] llistaCadenes= {"Hola","Avio","Pere","Josep","comercial","dijous"};
			
			IStrings iStrings=()->Metods.buscaOiBusca5 (llistaCadenes);
			iStrings.stringMethods().forEach((cadena) -> {
			    System.out.println(cadena);
				});
		
			}
		
		
			
}
