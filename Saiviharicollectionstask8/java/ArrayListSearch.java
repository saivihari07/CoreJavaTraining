package Saiviharicollectionstask8.java;
import java.util.ArrayList;
import java.util.List;
@SuppressWarnings("unused")
public class ArrayListSearch {

	public static void main(String[] args) {
		List<String> li = new ArrayList<>();
		{
		li.add("mango");
		li.add("apple");
		li.add("grapes");
		li.add("watermelon");
		li.add("pineapple");
	 li.add("orange");
		}	
		if(li.contains("apple"))
		{
			System.out.println("Found element");
			//System.err.println("hello sai");
		}
		else
		{
			System.out.println("Element not found");
		}
	}
}