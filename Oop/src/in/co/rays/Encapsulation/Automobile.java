package in.co.rays.Encapsulation;

public class Automobile {
	private String color;
	private int speed;
	private String make;

	public final static int NO_OF_GEARS = 5;

	public void setColor(String color) {
		this.color = color;

	}

	public String getColor() {
		return color;
	}

	public void setSpeed(int speed) {
		this.speed = speed;

	}

	public int getSpeed() {
		return speed;
	}

	public void setMake(String make) {
		this.make = make;

	}

	public String getMake() {
		return make;
	}

	public void Break() {
		if (this.speed == 0) {
			System.out.println("car already stop");
		} else {
			this.speed = this.speed - 10;
			System.out.println("applyBreak");
		}
	}

	public void accelerator() {
		if (speed >= 100) {
			System.out.println("speed limit is high please applay brake");
		} else {
			speed = speed + 10;
		}

	}

	public void changeGear() {

		switch (NO_OF_GEARS) {
		case 1: {
			System.out.println("max speed 20km/h");
		}
		case 2: {
			System.out.println("max speed 40km/h");
		}
		case 3: {
			System.out.println("max speed 60km/h");
		}
		case 4: {
			System.out.println("max speed 80km/h");
		}
		case 5: {
			System.out.println("max speed 100km/h");
		}
		}

	}

}
