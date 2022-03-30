package Saiviharicollectionstask3.java;
import java.util.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapUsingKeySet {

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
		
		Iterator it = countries.keySet().iterator();
		//now iterating the values.....
		while(it.hasNext())
		{
			Object s = it.next();
			System.out.println(s+"..."+countries.get(s));
			
		}
	}

}
