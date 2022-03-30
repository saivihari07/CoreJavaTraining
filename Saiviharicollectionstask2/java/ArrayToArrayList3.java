package Saiviharicollectionstask2.java;
import java.util.*;
public class ArrayToArrayList3 {

	public static void main(String[] args) {
		String parts[]	= {"MONITOR","CPU","KEYBOARD","MOUSE","PRINTER","WLAN"};
		System.out.println("Before converting array to arraylist");
		for(int i=0;i<parts.length;i++)
		{
			System.out.println(parts[i]);
		}
		ArrayList<String> li = new ArrayList();
		System.out.println("------------------------------");
		System.out.println("After converting array into arraylist");
		li.addAll(Arrays.asList(parts));
		System.out.println(li);
	}

}
