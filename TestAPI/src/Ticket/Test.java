package Ticket;

public class Test {
	public static void main(String[] args) {
		Trans t = new Trans();
		Point p1 = new Point(t, "NeuA");
		Point p2 = new Point(t, "NeuB");
		p1.start();
		p2.start();
	}
}
