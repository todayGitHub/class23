package LoL;

public class Test {
	public static void main(String[] args) {
		Putong pt = new Putong();
		HuludaoWQL wql = new HuludaoWQL(pt);
		//wql.play();
		Miss m = new Miss(wql);
		Kai55 kai = new Kai55(m);
		//kai.play();
		Ayi a = new Ayi(kai);
		FengtTM ft = new FengtTM(a);
		ft.play();
	}
}
