package Saiviharicollectionstask4.java;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListSort {

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
		//it is ascending order we should convert into descending..
		Collections.sort(li);
		System.out.println(li);
		Collections.sort(li,Collections.reverseOrder());
		
		System.out.println("Arraylist in descending order");
		 System.out.println(li);
		
	}
}
