/*Input:HashMap
{selva:75.6f, abi:89.5f,ram:40}
Output:hashmap
{selva:pass,abi:pass,ram:fail}*/
//If the mark is >60 return the names and their status as pass in a output hashmap else fail
package Saiviharicollectionstask16.java;

import java.util.HashMap;
import java.util.Map;
import java.util.*;
public class HashMapEx {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	Map<String,Double> marks = new HashMap<String,Double>();
	{
		marks.put("selva", 0.0);    
		marks.put("abi", 0.0);    
        marks.put("ram", 0.0);
	}
	
	for(int i = 0; i<15; i++) {
		if(marks.get(i) ==0) {
		System.out.println("please enter your marks :" );
		
		marks.put(,sc.next());
		System.out.println("your slot number is :" +i);
		continue;

	
	
 }
	
 }
}
