package proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class BookProxy implements InvocationHandler {
	private Object object;

	public BookProxy(Object object) {
		this.object = object;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = method.invoke(object, args);
		doSomething();
		return result;
	}

	public void doSomething() {
		System.out.println("do something");
	}
}
