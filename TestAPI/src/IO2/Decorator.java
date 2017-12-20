package IO2;

public class Decorator extends ADecorator{

	public Decorator(AComonpent ac) {
		super(ac);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doMoreAnyThing() {
		// TODO Auto-generated method stub
		System.out.println("做了更多的事情");
	}
}
