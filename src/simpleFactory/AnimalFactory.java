package simpleFactory;

public class AnimalFactory {
	public static final int DOG = 1;
	public static final int ELEPHANT = 2;
	public static final int MONKEY = 3;

	public static Animal createAnimal(int type) {
		switch (type) {
		case DOG:
			return new Dog();
		case ELEPHANT:
			return new Elephant();
		case MONKEY:
			return new Monkey();
		default:
			return null;
		}
	}
}
