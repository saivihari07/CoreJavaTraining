package ParkingslotTask;

import java.util.ArrayList;
import java.util.Scanner;

public class Bikes {

	Scanner sc = new Scanner(System.in);
	ArrayList Bikes1 = new ArrayList();
	Bikes(){
	Bikes1.add(5);
	Bikes1.add(10);
	Bikes1.add(null);
	Bikes1.add(2);
	Bikes1.add(4);
	Bikes1.add(null);
	Bikes1.add(1);
	Bikes1.add(3);
	Bikes1.add(9);
	Bikes1.add(6);
	Bikes1.add(11);
	Bikes1.add(null);
	Bikes1.add(7);
	Bikes1.add(null);
	Bikes1.add(15);

	for(int i = 0; i<15; i++) {
	if(Bikes1.get(i) ==null) {
	System.out.println("your name is :" );

	Bikes1.add(i,sc.next());
	System.out.println("your slot number is :" +i);
	continue;
	}
	}
	}
}


