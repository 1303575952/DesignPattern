package factoryMethod;

public class HuaweiFactory implements PhoneFactory {

	@Override
	public Phone createPhone() {
		return new HuaweiPhone();
	}

}
