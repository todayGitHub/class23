package Net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s = new Socket("localhost", 8888);
		OutputStream os = s.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(os);
		PrintWriter pw = new PrintWriter(osw);
		pw.println("Ô¼²»£¿");
		pw.flush();
		
		InputStream is =s.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		System.out.println(br.readLine());
		
		pw.close();
		osw.close();
		os.close();
		s.close();
		br.close();
		isr.close();
		s.close();
	
	}
}
