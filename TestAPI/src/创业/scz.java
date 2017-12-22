package 创业;

public class scz extends Thread {
	String name;
	cup c;

	public scz(String name, cup c) {
		super();
		this.name = name;
		this.c = c;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		sc();
	}

	void sc() {
		while (true) {
			synchronized (c) {
				while (c.empty == false) {
					try {
						Thread.sleep(300);
						c.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			
				c.setEmpty(false);
				System.out.println(name + "刚刚斟满了一被咖啡");
				c.notifyAll();
			}
		}

	}

}
