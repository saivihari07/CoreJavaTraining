package Saiviharicollectionstask1.java;
import java.util.*;
public class ReadMapOnly {
	public static void main(String[] args) {
		Map<String,String> countries = new HashMap<String,String>();
		countries.put("INDIA","DELHI");
		countries.put("CHINA","BEJING");
		countries.put("UK","LONDON");
		countries.put("AMERICA","WASHINGTON DC");
		countries.put("JAPAN","TOKYO");
		countries.put("AFGHANISTAN", "KABUL");
		
		System.out.println("map before unmodifiable..");
		System.out.println(countries);
		
		countries = Collections.unmodifiableMap(countries);
		
		/*System.out.println("map after unmodifiable ");
		System.out.println("----------------------------");
		countries.put("SRILANKA", "COLOMBO");
		System.out.println(countries);*/
		
	}
}
