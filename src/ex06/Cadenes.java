package ex06;


//Classe De Strings que implementa interfície Comparable

public class Cadenes implements Comparable<Cadenes> {
	
	private String cadena;
	
	public Cadenes(String cadena) {
		this.cadena=cadena;
	}
	public Object getCadena() {
		return cadena;
	}
	
	//Metode sobreescrit de l'interfície Comparable per ordenar de major a menor
	@Override
	 public int compareTo(Cadenes a) {
		return this.cadena.compareTo(a.cadena);
	}
}



