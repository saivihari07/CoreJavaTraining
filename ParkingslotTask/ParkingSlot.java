package ParkingslotTask;
import java.util.Scanner;
public class ParkingSlot {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter 1 for bikes: or enter 2 for cars:");
	int x= sc.nextInt();
	if (x==1) {
	Bikes b = new Bikes();
	}
	else {
	Cars c = new Cars();
	}
	
 }
	
}

	




