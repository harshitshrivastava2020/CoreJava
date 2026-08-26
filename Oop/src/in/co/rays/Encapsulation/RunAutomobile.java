package in.co.rays.Encapsulation;

public class RunAutomobile {
	public static void main(String[] args) {
		Automobile car = new Automobile();

		car.setColor("Red");
		car.setSpeed(80);
		car.setMake("Tata");

		System.out.println("car color: " + car.getColor());
		System.out.println("car speed: " + car.getSpeed()+"km/h");
		System.out.println("car company: " + car.getMake());

	}

}
