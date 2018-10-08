package adapter;

public class Main {
	public static void main(String[] args) {
		User user = new User(new TwoPinPlugAdapter());
		user.charge();
	}
}
