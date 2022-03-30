package Saiviharicollectionstask2.java;
import java.util.*;
public class ArrayToArrayList2 {

	public static void main(String[] args) {
		String parts[]	= {"MONITOR","CPU","KEYBOARD","MOUSE","PRINTER","WLAN"};
		System.out.println("before converting array to arraylist");
		for(int i=0;i<parts.length;i++)
		{
			System.out.println(parts[i]);
		}
		List<String> li = new ArrayList();
		System.out.println("------------------------------");
		System.out.println("After converting array into arraylist");
		Collections.addAll(li, parts);
		System.out.println(li);

	}

}
