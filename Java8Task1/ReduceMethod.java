package Java8Task1;
import java.util.*;

public class ReduceMethod {

	public static void main(String[] args) {
		List<String> colors = Arrays.asList("Red","Yellow","Blue","Green","Violet","Brown","Black");
		Optional<String> color = colors.stream().reduce((val1,val2)->val2+val1);
		
		System.out.println(color);

	}

}
