package Saivihariexceptiontask2.java;

public class MultipleCatchExample {

	public static void main(String[] args) {
		int a[] = { 20, 10, 45, 23, 56 };

		try {
			System.out.println(a[9]);
		} catch (ArithmeticException e) {
			System.out.println("It is " + e);
		}
		
		 catch(ArrayIndexOutOfBoundsException e)
		{ 
			 System.out.println("It is "+e); 
			 }
		 

		catch (Exception e) {
			System.out.println("It is " + e);
		}

		System.out.println("rest of the code");

	}

}
