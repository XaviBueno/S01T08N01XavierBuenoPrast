package ex03;

import java.util.List;
import java.util.Locale;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.Calendar;
public class Mesos {

	public static void main(String[] args) {

	
		
		
		elsMesosDelAny().forEach((mes)->System.out.println(mes));
		
		
		
	}
	//RETORNA ELS MESOS DEL ANY
	
	static List<String> elsMesosDelAny(){
		Locale locale=new Locale("es","ES");
		DateFormatSymbols mesos=new	DateFormatSymbols(locale);
		String[] mesosAny=mesos.getMonths();
		List<String> llistaMesos= new ArrayList<String>();
		llistaMesos=Arrays.asList(mesosAny);
		return llistaMesos;
	}
	
	
	
	
	

}
