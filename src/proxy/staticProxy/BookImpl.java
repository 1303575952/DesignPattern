package proxy.staticProxy;
/*
 * Î¯ÍÐÀà
 */
public class BookImpl implements BookInterface {

	@Override
	public void addBook() {
		System.out.println("Impl");
	}

}
