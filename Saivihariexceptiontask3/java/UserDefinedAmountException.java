package Saivihariexceptiontask3.java;
import java.util.Scanner;
public class UserDefinedAmountException {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the valid amount");
		int a = sc.nextInt();
		
		try
		{
			
			if(a<0)
			{
				throw new NegativeAmountException("Invalid Amount");
			}
			System.out.println("Amount is deposited");
		}
		catch(NegativeAmountException nae)
		{
			System.out.println(nae);
		}
	}

}
