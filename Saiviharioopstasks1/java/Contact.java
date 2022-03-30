/*Ques 1.Consider a cell phone where you save your Contacts. 
 * Suppose a person has two contact numbers. For the ease of accessibility,
 your cell phone provides you the functionality
 where you can save two or more numbers under the same name.
 use polymorphism concept in this scenario*/
package Saiviharioopstasks1.java;
public class Contact
{
	int  number1;
	int number2;
	public void Stranger(String name,int number1)
	{
		
		this.number1 = number1;
		System.out.println("The "+number1+" is saved under "+name);
	}
	public void Stranger(String name,int number1,int number2)
	{
		this.number1 = number1;
		this.number2 = number2;
		System.out.println("The "+number1+" and "+number2+" is saved under "+name);
	}

	/*
	 * public static void main(String[] args) { Contact c = new Contact();
	 * c.Stranger("Sai",245678); c.Stranger("Sai",245678,458725);
	 * 
	 * }
	 */


}
