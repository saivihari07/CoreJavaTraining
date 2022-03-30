//Arraylist add element at specific index
package Saiviharicollectionstask4.java;
import java.util.List;
import java.util.ArrayList;
public class ArrayListAddIndex {

	public static void main(String[] args) {
		List<String> li = new ArrayList<>();
		{
		li.add("apple");
		li.add("grapes");
		li.add("orange");
		li.add("pineapple");
		li.add("watermelon");
		}
		for(String s : li)
		{
			System.out.println(s);
		}
		System.out.println("-------------------------------------");
		li.add(0,"banana");
		li.add(3,"gauva");
		System.out.println(li);

	}
}

