package Thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Reading implements Runnable{
	private Socket s;	
	public Reading(Socket s) {
		super();
		this.s = s;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		read();
	}	
	void read(){
		BufferedReader br = null;
		String sread = null;
		try {
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}		
		while(true){
				
			try {
				sread = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(sread);
			if( sread.contains("88")){
				break;
			}
		}
			   
		
		
	}

}
