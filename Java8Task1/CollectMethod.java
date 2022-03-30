package Java8Task1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectMethod {
	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("apple","orange","grapes","banana","pineapple","papaya");
		  List<String> fruit = fruits.stream().filter(s->s.length()>3).collect(Collectors.toList());
		System.out.println(fruit);
	}
}
	