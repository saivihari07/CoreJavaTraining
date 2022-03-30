package Saivihariexceptiontask1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class InvalidEmployeeIdException extends Exception
{
	public InvalidEmployeeIdException(String str)
	{
		super(str);
	}
	
}

public class CustomException{
	
	public static void main(String args[]) {

	Scanner sc = new Scanner(System.in);
	PojoTask pt1 = new PojoTask(201,"sai","hyderabad");
	PojoTask pt2 = new PojoTask(227,"mahesh","hyderabad");
	PojoTask pt3 = new PojoTask(228,"suresh","hyderabad");
	List<PojoTask> l = new ArrayList<>();{
	
		l.add(pt1);
		l.add(pt2);
		l.add(pt3);
	}

	System.out.println("enter you ids");
	int id = sc.nextInt();

	try
	{
		for(int i=0;i<l.size();i++)
		{
			if(l.get(i).id_no == id) {
				System.out.println("welcome to office");
				return;
		}
	}
		throw new InvalidEmployeeIdException("Invalid id");
	}
	catch(InvalidEmployeeIdException ieie) {
		System.out.println("caught the exception");
		System.out.println("catch invalid exception "+ieie);
	}
	System.out.println("print remaining code");
	
	}
}

	
	
	
	


