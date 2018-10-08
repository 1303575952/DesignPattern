package observer;

public class User implements Observer {
	private String name;
	private String message;

	public User(String name) {
		this.name = name;
	}

	@Override
	public void update(String message) {
		this.message = message;
		show();
	}

	public void show() {
		System.out.println(this.name + " receive message {" + this.message + "}");
	}
}
