package LoL;

public abstract class LoLzhubo implements LoL{
	private LoL pt;
	
	LoLzhubo(LoL lol) {
		super();
		this.pt = lol;
	}
	
	protected abstract void getMoney();

	@Override
	public void play() {
		// TODO Auto-generated method stub
		pt.play();
		getMoney();
	}
	
}
