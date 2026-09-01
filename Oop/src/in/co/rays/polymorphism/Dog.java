package in.co.rays.polymorphism;

public class Dog extends Animal {
	private String dogSound = "woof";

	public String getName() {
		return "Dog";
	}

	@Override
	public void animalSound() {
		System.out.println("Sound: " + dogSound);
	}

}
