package ParkingslotTask;
import java.util.ArrayList;
import java.util.Scanner;

public class Cars {



	Scanner sc = new Scanner(System.in);
	ArrayList car1 = new ArrayList<>();
	Cars(){
	car1.add(7);
	car1.add(10);
	car1.add(4);
	car1.add(2);
	car1.add(null);
	car1.add(null);
	car1.add(1);
	car1.add(5);
	car1.add(9);
	car1.add(14);
	car1.add(null);
	car1.add(10);
	car1.add(3);
	car1.add(null);
	car1.add(15);
	for(int i =0; i<=15; i++) {
	if(car1.get(i) == null) {
	System.out.println("enter your name");

	car1.add(i, sc.next());
	System.out.println(" your slot number:" +i);
	continue;
	}
	}
}
}
