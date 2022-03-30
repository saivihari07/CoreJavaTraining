package Parkingslotsystem;

public class ParkingSpot {
	public ParkingSpotType type;
	private Vehicle vehicle;
	boolean free;
	
	
	
	
	public ParkingSpot(ParkingSpotType parkingSpotType) {
		
		this.type = parkingSpotType;
	}
	
	
	//getters and setters
	public ParkingSpotType getType() {
		return type;
	}
	public void setType(ParkingSpotType type) {
		this.type = type;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public boolean isFree() {
		return free;
	}
	public void setFree(boolean free) {
		this.free = free;
	}
	
	
	
	

}
	
