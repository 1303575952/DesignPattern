package proxy.staticProxy;

public class Main {
	public static void main(String[] args) {
		BookImpl imp = new BookImpl();
		BookProxy bookProxy = new BookProxy(imp);
		bookProxy.addBook();
	}
}
