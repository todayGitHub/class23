package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestObjectReader {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("C:/Daxiang.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		((Daxiang)ois.readObject()).hehe();
		
	}
}
 