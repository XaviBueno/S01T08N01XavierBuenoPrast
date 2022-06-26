package ex07;

public class Cadenes implements Comparable<Cadenes> {
	
	private String cadena;
	
	public Cadenes(String cadena) {
		this.cadena=cadena;
	}
	public Object getCadena() {
		return cadena;
	}
	
	//Compara si a > que cadena s'obten ordenar de major a menor 
	@Override
	 public int compareTo(Cadenes a) {
	
		return a.cadena.compareTo(this.cadena);
	}
}



