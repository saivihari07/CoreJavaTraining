package Saiviharicollectionstask1.java;
import java.util.*;
public class ReadSetOnly {

	public static void main(String[] args) {
		Set<String> fruits = new HashSet<>();
		{
		fruits.add("apple");
		fruits.add("grapes");
		fruits.add("orange");
		fruits.add("pineapple");
		fruits.add("watermelon");
		}
		System.out.println("Set before applying read only operations..");
		System.out.println(fruits);
		
		/*fruits = Collections.unmodifiableSet(fruits);//applying condition that fruits can't be unmodified..
		fruits.add("mango");
		System.out.println(fruits);*/
	}

}
