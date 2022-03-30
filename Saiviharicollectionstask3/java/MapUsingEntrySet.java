package Saiviharicollectionstask3.java;
import java.util.*;
import java.util.Map.Entry;
public class MapUsingEntrySet {

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
		//getting the key values...
		
		Set<Entry<String,String>> en = countries.entrySet(); 
		//iterating using for loop....
		System.out.println("Map After iterating....");
		for(Entry<String,String> entry : en)
		{
			System.out.println(entry);
		}
		
		
		
		
	}

}
