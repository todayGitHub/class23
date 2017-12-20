package Net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(8888);
		Socket s = ss.accept();
		InputStream is =s.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		System.out.println(br.readLine());
		
		OutputStream os = s.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(os);
		PrintWriter pw = new PrintWriter(osw);
		pw.println("不约，不约，我不约");
		pw.close();
		osw.close();
		os.close();
		pw.flush();
		br.close();
		isr.close();
		s.close();
		ss.close();
	
	}
}
