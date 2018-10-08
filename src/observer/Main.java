package observer;

public class Main {
	public static void main(String[] args) {
		MessageServer server = new MessageServer();
		server.registerObserver(new User("stalary"));
		server.registerObserver(new User("hawk"));
		User claire = new User("claire");
		server.registerObserver(claire);
		server.push("The course will start");
		server.removeObserver(claire);
		server.push("The course is over");
	}
}
