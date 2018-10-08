package factoryMethod;

public class AppleFactory implements PhoneFactory {

	@Override
	public Phone createPhone() {
		return new ApplePhone();
	}

}
