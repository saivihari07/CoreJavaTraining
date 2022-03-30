package Saiviharicollectionstask15.java;
import java.util.*;
import java.util.Map.Entry;
public class SortHashMapByValue {
	public static void main(String[] args) {
		Map<String,Integer> numbers = new HashMap<String,Integer>();
		{
			numbers.put("ONE",1);
			numbers.put("EIGHT",8);
			numbers.put("TEN",10);
			numbers.put("TWO",2);
			numbers.put("FOUR",4);
			numbers.put("THREE", 3);
		}
		System.out.println("Before sorting ");
		Set set = numbers.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext())
		{
			Map.Entry mp = (Map.Entry)it.next();
			System.out.println(mp);
			//System.out.println(mp.getValue()+" ");
		}
		/*Map<String,Integer> maps = new TreeMap<String,Integer>();
		System.out.println("After sorting");
		Set set2 = maps.entrySet();
		Iterator it2 = set2.iterator();
		while(it2.hasNext())
		{
			Map.Entry mp = (Map.Entry)it2.next();
			System.out.println(mp);
			//System.out.println(mp.getValue()+" ");
		}*/
		
		
		
		
	}

}
