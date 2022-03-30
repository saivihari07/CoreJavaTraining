//replace an element at specified index arraylist
package Saiviharicollectionstask7.java;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListReplace {

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
		System.out.println("Arraylist before replacing...");
		System.out.println(li);
		System.out.println("----------------------------------------");
		String s = "banana";
		li.set(3, s);
		System.out.println("Arraylist after replacing");
		System.out.println(li);
	}
}
		
		
		