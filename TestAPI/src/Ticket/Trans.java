package Ticket;

public class Trans {
	int ticket = 10;
	int  getTicket(){
		System.out.println("火车刚出了一张票");
		synchronized (this) {
			if(ticket>=1){
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
					return ticket--;
				
			}else{
				return -1;
			}
		
		}
		
	}
}
