package abstractFactory;

public class PhoneFactory2 implements Factory {

	@Override
	public IOS createIOS() {
		return new Iphone();
	}

	@Override
	public Android createAndroid() {
		return new Xiaomi();
	}

}
