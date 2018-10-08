package factoryMethod;

public class Main {
	public static void main(String[] args) {
		PhoneFactory factory;
		factory = new AppleFactory();
		Phone apple = factory.createPhone();
		apple.desc();

		factory = new XiaomiFactory();
		Phone xiaomi = factory.createPhone();
		xiaomi.desc();

		factory = new HuaweiFactory();
		Phone huawei = factory.createPhone();
		huawei.desc();
	}
}
