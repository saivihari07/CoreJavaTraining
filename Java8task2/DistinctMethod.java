package Java8task2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctMethod {
	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(1,2,3,3,4,5,1,3,2,10,11,10);
		List<Integer> numbers = num.stream().distinct().collect(Collectors.toList());
		System.out.println(numbers);
		
	}
}
