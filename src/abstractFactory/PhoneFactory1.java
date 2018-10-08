package abstractFactory;

public class PhoneFactory1 implements Factory {

	@Override
	public IOS createIOS() {
		return new Iphone();
	}

	@Override
	public Android createAndroid() {
		return new Huawei();
	}

}
