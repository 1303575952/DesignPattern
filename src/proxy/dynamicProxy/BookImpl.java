package proxy.dynamicProxy;
/*
 * ί����
 */
public class BookImpl implements BookInterface {

	@Override
	public void addBook() {
		System.out.println("Impl");
	}

}
