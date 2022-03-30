//Remove element from specified index ArrayList
package Saiviharicollectionstask9.java;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListRemove {

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
		System.out.println("Elements before removing");
		System.out.println(li);
		li.remove(3);
		System.out.println("Elements after removing");
		System.out.println(li);
	}
}

		
