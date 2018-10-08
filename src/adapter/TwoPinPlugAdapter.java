package adapter;

public class TwoPinPlugAdapter implements ThreePinPlug {
	private TwoPinPlug plug;

	public TwoPinPlugAdapter() {
		this.plug = new TwoPinPlug();
	}

	@Override
	public void charge() {
		plug.charge();
	}

}
