package IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestCopy {
	public static void main(String[] args) throws IOException {
		File c= new File("C:\\a.txt");
		FileReader fr = new FileReader(c);
		FileWriter fw = new FileWriter("E:/a.txt");
		
		BufferedReader br = new BufferedReader(fr);		
		PrintWriter pw = new PrintWriter(fw);
		
		
		String s = br.readLine();
		while(s!=null){
			pw.println(s);
			s = br.readLine();
		}
		
		pw.flush();
		pw.close();
		br.close();
		fw.close();
		fr.close();
		
//		int a = fr.read();
//		while(a!=-1){
//			fw.write(a);
//			a = fr.read();
//		}
//		
//		fw.flush();
//		fw.close();
//		fr.close();
	}
}
