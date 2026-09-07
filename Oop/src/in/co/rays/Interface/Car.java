package in.co.rays.Interface;

public class Car extends MotorCar implements Vehicle {
	private int currentSpeed = 0;

	@Override
	public void start() {
		System.out.println("Car engine started.");
	}

	@Override
	public void accelerate(int speed) {
		currentSpeed = currentSpeed + speed;
		System.out.println("Car is acclerated to " + currentSpeed + " mph.");
	}

	@Override
	public void brake() {
		currentSpeed = 0;
		System.out.println("Car stopped.");
	}

}
