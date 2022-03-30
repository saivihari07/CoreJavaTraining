/*WAP on custom exception where it gives an 'Invalid Employee ID' 
 * Exception while entering into an Organization or office .
Create a pojo class that contains Employee details including name ,id ,address .
If ID is not found must give exception mesaage that "given Employee ID is not found or mismatched ,
please enter the valid ID" and if ID is found give message as "Welcome to office". 
Take input from user and check the ID with the already existing Employee ids
Note: Please add multiple employee details*/
package Saivihariexceptiontask1;

class PojoTask
{
	int id_no;
	String name;
	String address;
	public PojoTask(int id_no,String name,String address)
	{
		this.id_no = id_no;
		this.name = name;
		this.address = address;
		
	}
}

