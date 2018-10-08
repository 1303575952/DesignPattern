package proxy.dynamicProxy;

import java.lang.reflect.Proxy;

public class Main {
	public static void main(String[] args) {
		BookImpl imp = new BookImpl();
		BookProxy bookProxy = new BookProxy(imp);
		BookInterface inter = (BookInterface) Proxy.newProxyInstance(imp.getClass().getClassLoader(),
				imp.getClass().getInterfaces(), bookProxy);
		inter.addBook();
	}
}
