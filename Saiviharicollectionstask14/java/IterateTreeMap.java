package Saiviharicollectionstask14.java;
import java.util.*;
public class IterateTreeMap {

	public static void main(String[] args) {
		Map<String,String> tm = new TreeMap<>();
		tm.put("INDIA","DELHI");
		tm.put("CHINA","BEJING");
		tm.put("UK","LONDON");
		tm.put("AMERICA","WASHINGTON DC");
		tm.put("JAPAN","TOKYO");
		tm.put("AFGHANISTAN", "KABUL");
		
		Set s = tm.entrySet();
		
		Iterator it = s.iterator();
		
		while(it.hasNext())
		{
			Map.Entry me = (Map.Entry)it.next();
			System.out.println(me);
		}
	}

}
