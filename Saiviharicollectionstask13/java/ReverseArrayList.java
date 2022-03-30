// Write a program to reverse ArrayList in java?
package Saiviharicollectionstask13.java;
import java.util.*;
public class ReverseArrayList {

	public static void main(String[] args) {
		List<String> cities = new ArrayList<>();
		cities.add("hyderabad");
		cities.add("mumbai");
		cities.add("banglore");
		cities.add("chennai");
		cities.add("delhi");
		cities.add("pune");
		System.out.println("Arraylist before reversing");
		System.out.println(cities);
		Collections.reverse(cities);//calling reverse method from collections class
		System.out.println("-----------------------------------");
		System.out.println("ArrayList after reversing");
		for(String s : cities)
		{
			System.out.println(s);
		}
		
	}

}
