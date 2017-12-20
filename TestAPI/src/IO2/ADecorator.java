package IO2;

public abstract class ADecorator implements AComonpent{
	
	private AComonpent ac;
	
	public ADecorator(AComonpent ac) {
		super();
		this.ac = ac;
	}
	
	protected abstract void doMoreAnyThing();

	@Override
	public void doAnyThing() {
		// TODO Auto-generated method stub
		ac.doAnyThing();
		doMoreAnyThing();
	}

}
