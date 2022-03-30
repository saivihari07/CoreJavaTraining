package Saiviharicollectionstask4.java;
import java.util.*;
public class ArrayListUsingIterator {

	public static void main(String[] args) {
		ArrayList<String> al =  new ArrayList<>();
		al.add("red");
		al.add("yellow");
		al.add("orange");
		al.add("blue");
		al.add("green");
		al.add("white");
		al.add("black");
		System.out.println("Arraylist before iterating");
		System.out.println(al);
		System.out.println("------------------------------------");
		System.out.println("Arraylist after iterating..");
		ListIterator it = al.listIterator();//using LIst Iterator....
		while(it.hasNext())
		{
			Object s = it.next();
			System.out.println(s);
		}
		
	}

}
