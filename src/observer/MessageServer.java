package observer;

import java.util.ArrayList;
import java.util.List;

public class MessageServer implements Observed {
	private List<Observer> list = new ArrayList<Observer>();
	private String message;

	@Override
	public void registerObserver(Observer observer) {
		list.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		list.remove(observer);
	}

	@Override
	public void notifyObserver() {
		list.forEach(observer -> observer.update(this.message));
	}

	public void push(String message) {
		this.message = message;
		notifyObserver();
	}
}
