package ex01;


public class Principal {

	public static void main(String[] args) {

		String[] llistaCadenes= {"Hola","Avio","Pere","Josep"};
			
		
		IStrings buscaStrings= ()->(Metods.buscaO(llistaCadenes));
		
		for(String out: buscaStrings.stringMethods() ) {
			System.out.println(out);
		}
		
	}
	 
}
	
	
	



