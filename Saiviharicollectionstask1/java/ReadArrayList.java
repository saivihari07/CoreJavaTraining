package Saiviharicollectionstask1.java;
import java.util.*;
public class ReadArrayList {

	public static void main(String[] args) {
		
		List<String> colors = new ArrayList<>();
		colors.add("red");
		colors.add("yellow");
		colors.add("orange");
		colors.add("blue");
		colors.add("green");
		colors.add("white");
		colors.add("black");
		
		List<String> unmodifiableList = Collections.unmodifiableList(colors);
		unmodifiableList.add("violet");//calling unmodifiable method to add an item...
		System.out.println(colors);
	}

}
