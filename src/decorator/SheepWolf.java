package decorator;

public class SheepWolf implements Animal {
	Animal animal;

	public SheepWolf(Animal animal) {
		super();
		this.animal = animal;
	}

	@Override
	public void shout() {
		animal.shout();
	}

	@Override
	public void appearance() {
		animal.appearance();
		System.out.println("I also have sheepskin");
	}

}
