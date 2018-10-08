package abstractFactory;

public class Main {
	public static void main(String[] args) {
		Factory factory = new PhoneFactory1();
		Android android1 = factory.createAndroid();
		android1.desc();
		IOS ios = factory.createIOS();
		ios.desc();
		Android android2 = factory.createAndroid();
		android2.desc();
	}
}
