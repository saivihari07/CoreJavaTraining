package Java8Task1;

import java.util.stream.Stream;

public class NoneMatch {
	    public static void main(String[] args)
	    {
	        Stream<String> stream
	            = Stream.of("CSE", "C++", "Java", "DS");
	        boolean answer
	            = stream.noneMatch(str -> (str.length() == 4));
	  
	 
	        System.out.println(answer);
	    }
}

