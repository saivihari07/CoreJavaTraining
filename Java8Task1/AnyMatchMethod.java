package Java8Task1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class AnyMatchMethod {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3, 4, 6, 12, 20);
		    boolean answer = list.stream().anyMatch(n-> (n * (n + 1)) / 4 == 5);
		      
		   System.out.println(answer);
		}
		}