package Saiviharicollectionstask6.java;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListSortStrings {

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
		for(String s : li)
		{
			System.out.println(s);
		}
		System.out.println("-------------------------------------");
		System.out.println("ArrayLIst after sorting");
		//now sorting the elements
		Collections.sort(li);
		System.out.println(li);
	}
}
