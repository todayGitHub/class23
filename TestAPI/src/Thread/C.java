package Thread;

public class C extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
//			
			if(i==30){
				//Thread.yield();
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("�ó�CPU");
			
			}
			
			System.out.println("c"+i);
		}
	}
	
}
