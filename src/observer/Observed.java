package observer;

public interface Observed {
	void registerObserver(Observer observer);

	void removeObserver(Observer observer);

	void notifyObserver();
}
