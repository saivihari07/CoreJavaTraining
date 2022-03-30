package Parkingslotsystem;
import java.util.*;
public class ParkingLot {
	Scanner sc = new Scanner(System.in);
	List<BikeSpot> bikes = new ArrayList<>();
	List<CarSpot> cars = new ArrayList<>();
	
	
	int bikeslots = 15;
	int carslots = 15;
	
	public ParkingLot(int bikeslots,int carslots )
	{
		this.bikeslots = bikeslots;
		this.carslots = carslots;
	}
	//parkvehicle
	
	public void parkVehicle(Vehicle vehicle)
	{
		System.out.println("You are about to park your vehicle "+vehicle.getVehicleType());
		
		if(vehicle.getVehicleType().equals(VehicleType.BIKE)) {
			
		}
	}
	
	
}
