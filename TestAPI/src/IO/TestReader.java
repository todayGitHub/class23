package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestReader {
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:/aa.txt");
		FileReader fr = new FileReader(f);
		int a = fr.read();
		while(a!=-1){
			System.out.print((char)a);
			a = fr.read();
		}

	}
}


