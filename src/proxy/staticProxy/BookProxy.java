package proxy.staticProxy;

/*
 * ¥˙¿Ì¿‡
 */
public class BookProxy implements BookInterface {
	private BookInterface inter;

	public BookProxy(BookInterface inter) {
		this.inter = inter;
	}

	@Override
	public void addBook() {
		inter.addBook();
		doSomething();
	}

	public void doSomething() {
		System.out.println("do something");
	}

}
