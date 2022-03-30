package Corejava.assignment;
class Employee
{
	String name;
	int id;
	String city;
	
	Employee(String name,int id,String city )
	{
		this.name= name;
		this.id = id;
		this.city = city;
	}
	public String toString() {
		return name+" "+id+" "+city;
				
	}
}
public class ToStringEx {
	public static void main(String[] args) {
		Employee em1 = new Employee("ravi",102,"hyd");
		Employee em2 = new Employee("sai",107,"hyd");
		
		System.out.println("print em1 :"+em1);
		System.out.println("print em2 :"+em2);
		
	}



}
