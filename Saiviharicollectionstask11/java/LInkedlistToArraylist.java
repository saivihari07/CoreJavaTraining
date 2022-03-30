package Saiviharicollectionstask11.java;
import java.util.*;
public class LInkedlistToArraylist {

	public static void main(String[] args) {
		List<String> lkl = new LinkedList<>();
		lkl.add("White");
		lkl.add("red");
		lkl.add("blue");
		lkl.add("green");
		lkl.add("yellow");
		lkl.add("black");
		
		List<String> al = new ArrayList<>(lkl);
		for(String str : lkl)
		{
			System.out.println(str);
		}
	}

}
