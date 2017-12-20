package Net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class QQServer {
	public static void main(String[] args) {
		System.out.println("妹子已登录，开始运行");
		ServerSocket ss = null;
		Socket s = null;
		Scanner sc = new Scanner(System.in);
		String sout = null;
		String sint =  "妹子在王松耳边悄悄的说：";
		BufferedReader br = null;
		PrintWriter pw =  null;
		try {
			ss = new ServerSocket(7777);
			s = ss.accept();
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			pw = new PrintWriter(s.getOutputStream());
			while(true){
				System.out.println(br.readLine());
				sout = sint+  sc.nextLine();
				pw.println(sout);
				pw.flush();
				if(sout.contains("88")){
					break;
				}
			}			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			pw.close();
			sc.close();
			try {
				s.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
