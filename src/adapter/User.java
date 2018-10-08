package adapter;

public class User {
	private ThreePinPlug plug;

	public User(ThreePinPlug plug) {
		this.plug = plug;
	}

	public ThreePinPlug getPlug() {
		return plug;
	}

	public void charge() {
		plug.charge();
	}
}
