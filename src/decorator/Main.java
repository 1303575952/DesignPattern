package decorator;

public class Main {
	public static void main(String[] args) {
		Animal animal = new SheepWolf(new Wolf());
		animal.shout();
		animal.appearance();
	}

}
