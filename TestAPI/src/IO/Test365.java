package IO;

import java.io.File;

public class Test365 {
	public static void main(String[] args) {
		//File  f365 = new File("C:/365");
		String s365 = "C:\\365";
		StringBuilder sb = new StringBuilder(s365);
		for (int i = 0; i < args.length; i++) {
			
		}
		for (int i = 0; i < 1000; i++) {
			sb.append(File.separator);
			sb.append(i);
			
		}
		System.out.println(sb.toString());
		File f = new File(sb.toString());
		System.out.println(f);
		f.mkdirs();
	}
}
