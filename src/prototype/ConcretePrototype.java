package prototype;

public class ConcretePrototype extends Prototype {

	private String field;

	public ConcretePrototype(String field) {
		this.field = field;
	}

	@Override
	Prototype myClone() {
		return new ConcretePrototype(field);
	}

	@Override
	public String toString() {
		return field;
	}

}
