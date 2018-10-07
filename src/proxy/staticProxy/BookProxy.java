package proxy.staticProxy;

public class BookProxy implements BookInterface {
	private BookInterface inter;

	public BookProxy(BookInterface inter) {
		this.inter = inter;
	}

	@Override
	public void addBook() {
		inter.addBook();
	}

}
