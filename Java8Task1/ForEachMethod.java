package Java8Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ForEachMethod {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		{
			al.add(100);
			al.add(15);
			al.add(5);
			al.add(85);
			al.add(0);
			al.add(25);
			al.add(55);
			al.add(20);
			System.out.println(al);
			
			al.stream().forEach(System.out::println);
	}
}

}