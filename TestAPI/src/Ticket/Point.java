package Ticket;

public class Point extends Thread{
	Trans t ;
	String name;

	public Point(Trans t,String name) {
		super();
		this.t = t;
		this.name = name;
	}
	
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		salTicket();
	}



	void salTicket(){
		int a = t.getTicket();
		while(a!=-1){
			
			System.out.println(name + "��Ʊ��ո������˵�"+a+"��Ʊ");
			a = t.getTicket();
		}
		
	}
	
}
