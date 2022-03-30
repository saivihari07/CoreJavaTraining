package Saiviharicollectionstask3.java;
import java.util.*;
import java.util.Map.Entry;
public class MapUsingJavaIterator {

	public static void main(String[] args) {
		Map<String,String> countries = new HashMap<String,String>();
		countries.put("INDIA","DELHI");
		countries.put("CHINA","BEJING");
		countries.put("UK","LONDON");
		countries.put("AMERICA","WASHINGTON DC");
		countries.put("JAPAN","TOKYO");
		countries.put("AFGHANISTAN", "KABUL");
		countries.put("SRILANKA","COLOMBO");
		countries.put("NEPAL","KATMANDU");
		System.out.println("Map before applying iterator");
		
		System.out.println(countries);
		System.out.println("----------------------------------------");
		//getting key values...
		Iterator<Entry<String,String>> en = countries.entrySet().iterator();
		System.out.println("Map after iterating the key value pairs");
		//now iterating the mapping using java iterator..
		while(en.hasNext())
		{
			Entry<String,String> entry = en.next();
			System.out.println(entry);
		}
		
		
	}

}
