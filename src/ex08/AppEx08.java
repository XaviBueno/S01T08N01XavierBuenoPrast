package ex08;

public class AppEx08 {

	public static void main(String[] args) {
		String stringTest="Això és una prova de reverse"; //"Això és una prova";
		
		
		 Reverse testReverse = (String string ) ->{
			 String sortida="";
			for (int i=string.length()-1; i>=0; i--) {
				sortida+= string.charAt(i);
				
			}
			return sortida;
			
		};
		System.out.println(testReverse.reverse(stringTest));
		

	}

}
