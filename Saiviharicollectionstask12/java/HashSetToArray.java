package Saiviharicollectionstask12.java;
import java.util.*;
public class HashSetToArray {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<>(); 
		hs.add("mango");
		hs.add("apple");
		hs.add("grapes");
		hs.add("watermelon");
		hs.add("pineapple");
		hs.add("orange");
		System.out.println("Hashset before converting into array");
		System.out.println(hs);
		
		String s[] = new String[hs.size()];
		
		hs.toArray(s);
		
		System.out.println("After converting into array");
		System.out.println(s);
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
		
		
	}

}
