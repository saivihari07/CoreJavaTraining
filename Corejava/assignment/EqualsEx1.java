package Corejava.assignment;

public class EqualsEx1 {
	public static void main(String[] args) {
		String s1  = "techouts";
		String s2 = "TECHOUTS";
		String s3 = "company";
		String s4  = "techouts";
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s4));
		System.out.println(s4.equals(s4));
	}
}
