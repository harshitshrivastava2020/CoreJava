package in.co.rays.polymorphism;

public class Cat extends Animal{
	private String catSound="meow";

	public String getName() {
		return "Cat";
	}
	@Override
	public void animalSound() {
		System.out.println("sound: "+catSound);
		
	}
}
