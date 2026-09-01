package in.co.rays.polymorphism;

public class Bird extends Animal {
	private String birdSound="tweet";
	
	public String getName() {
		return "house sparrow";
	}
	@Override
	public void animalSound() {
		System.out.println("Sound: "+ birdSound);
	}

}
