package Corejava.assignment;

import java.util.ArrayList;

public class EqualsEx2 {

	public static void main(String[] args) {
		String s1="Sai";
		
		ArrayList<String> list = new ArrayList<>();
		list.add("Ramesh");
		list.add("Sai");
		list.add("Ravi");
		list.add("Raju");
		
		for(String s : list)
		{
			if(s.equals(s1))
				System.out.println(s1+" is present");
			
		}
	}

}
