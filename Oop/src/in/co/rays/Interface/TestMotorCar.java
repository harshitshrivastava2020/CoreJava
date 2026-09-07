package in.co.rays.Interface;

public class TestMotorCar {
	public static void main(String[] args) {
		Vehicle myVehicle = new Car();

		myVehicle.start();
		myVehicle.accelerate(60);
		myVehicle.brake();
	}
}
