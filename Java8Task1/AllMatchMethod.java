package Java8Task1;

import java.util.Arrays;
import java.util.List;

public class AllMatchMethod {
	    public static void main(String[] args) {
	  
	    List<Integer> list = Arrays.asList(3, 4, 6, 12, 20);
	    boolean answer = list.stream().allMatch(n-> n % 3 ==0);
	    System.out.println(answer);
	}
}

