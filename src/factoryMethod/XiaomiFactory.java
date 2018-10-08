package factoryMethod;

public class XiaomiFactory implements PhoneFactory {

	@Override
	public Phone createPhone() {
		return new XiaomiPhone();
	}

}
