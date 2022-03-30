package Parkingslotsystem;

public class Vehicle{
	int vehicleNo;
	VehicleType vehicleType;
	ParkingSpot parkingSpot;
	
	public Vehicle(VehicleType vehicle) {
		this.vehicleType = vehicle;
	}
	
	//getters and setters
	public int getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(int vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public VehicleType getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(VehicleType vehicle) {
		this.vehicleType = vehicle;
	}
	public ParkingSpot getParkingSpot() {
		return parkingSpot;
	}
	public void setParkingSpot(ParkingSpot parkingSpot) {
		this.parkingSpot = parkingSpot;
	}
	
	
	
	
	
	
	
	
}

