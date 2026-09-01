package in.co.rays.polymorphism;

public class Rat extends Animal {
	private String ratSound="Squeaks";
	
	public String getName() {
		return "Rat";
	}
	@Override
	public void animalSound() {
		System.out.println("Sound: "+ratSound);
	}

}
