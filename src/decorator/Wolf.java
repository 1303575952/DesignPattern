package decorator;

public class Wolf implements Animal {

	@Override
	public void shout() {
		System.out.println("I am a wolf");
	}

	@Override
	public void appearance() {
		System.out.println("I have gray fur");
	}

}
