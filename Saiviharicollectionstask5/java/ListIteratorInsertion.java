package Saiviharicollectionstask5.java;
import java.util.*;
public class ListIteratorInsertion {
	public static void main(String[] args) {
	ArrayList<Integer>li = new ArrayList<Integer>();
	li.add(100);
    li.add(200);
    li.add(300);
    li.add(400);
    li.add(500);
    li.add(600);
    li.add(700);
    li.add(800);
    ListIterator<Integer> it = li.listIterator();
    it.add(1000);
    it.add(2000);
    it.add(3000);
    for(int i : li)
    {
    	System.out.println(i);
    }
    
    
	}
}
