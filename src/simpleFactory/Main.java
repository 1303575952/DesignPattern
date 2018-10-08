package simpleFactory;

public class Main {
	public static void main(String[] args) {
		Animal animal1 = AnimalFactory.createAnimal(AnimalFactory.DOG);
		animal1.desc();
		Animal animal2 = AnimalFactory.createAnimal(AnimalFactory.ELEPHANT);
		animal2.desc();
	}
}
