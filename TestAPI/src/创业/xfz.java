package 创业;

public class xfz extends Thread {
	String name;
	cup c;

	public xfz(String name, cup c) {
		super();
		this.name = name;
		this.c = c;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		xf();
	}

	void xf() {
		while (true) {
			synchronized (c) {
				while (c.empty == true) {
					try {
						Thread.sleep(300);
						c.wait();
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}

			
				c.setEmpty(true);
				System.out.println(name + "刚刚对着这杯咖啡一饮而尽");
				c.notifyAll();
			}
		}

	}
}
