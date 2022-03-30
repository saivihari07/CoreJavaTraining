package ParkingslotTask;

import java.util.Scanner;

public class ParkingSlots {

	public static void main(String[] args) {

		System.out.println("please enter vehical type bike/car");
		Scanner sc = new Scanner(System.in);
		String vehical = sc.nextLine();
		System.out.println("there are two parking slots where you want to park your vehicle b1/b2");
		String parking = sc.nextLine();
		int slot = 30;
		switch (parking) {
		case "b1":
			System.out.println("you parked your bike in basement b1");
			System.out.println("Your parking token number is :" + slot);
			slot--;
			System.out.println("the are only :" + slot + "slots avalible");

			break;
		case "b2":
			System.out.println("you parked your bike in basement b2");
			slot--;
			System.out.println("the are only :" + slot + "slots avalible");
			break;
		default:
			System.out.println("plz enter your vehical type");
			break;
		}

	}

}
