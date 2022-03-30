package Corejava.assignment;

import java.util.LinkedList;

class Student
{
	
}
public class HashCodeEx {

	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1.hashCode());
		
		Student s2 = new Student();
		System.out.println(s2.hashCode());
		
		Student s3 = new Student();
		System.out.println(s3.hashCode());
		
		
		
		String str = new String();
		System.out.println(str.hashCode());
		
		LinkedList<Integer> list = new LinkedList<>();
		System.out.println(list.hashCode());
		
	}

}
