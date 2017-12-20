package Object;

public class Card {
	private String suit;
	private String count;
	public Card(){
		
	}
	public Card(String suit, String count) {
		super();
		this.suit = suit;
		this.count = count;
	}
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		
		this.suit = suit;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	
	public void show(Card[] c){
		for (int i = 0; i < c.length; i++) {
			System.out.println("这是一张"+c[i].getSuit()+c[i].getCount()+"牌");
		}
	}
	
	
	public static void main(String[] args) {
		String[] s1 = {"黑桃","红桃","方块","梅花"};
		String[] s2 = {"A","2","3","4","5","6","7","8","9","10","J","Q","k"};
		Card[] c = new Card[s1.length*s2.length];
		for (int j = 0; j < s2.length; j++) {
			for (int i = 0; i < s1.length; i++) {
				c[i+j*4] = new Card(s1[i],s2[j]);
			}
		}
		
		new Card().show(c);
		
	}
	
	
}
