package in.co.rays.polymorphism;

public class RunAnimal {
	public static void main(String[] args) {
		Animal[] animals = new Animal[4];
		animals[0] = new Dog();
		animals[1] = new Cat();
		animals[2] = new Rat();
		animals[3]= new Bird();

		findAnimalNameAndSound(animals);
	}

	private static void findAnimalNameAndSound(Animal[] animals) {
		for (int i = 0; i < animals.length; i++) {
			System.out.println("Animal name: " + animals[i].getName());
			animals[i].animalSound();
			System.out.println("---------------------------------------------");
		}

	}

}
