package IO2;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Test {
	
	public static void main(String[] args) throws IOException {
//		InputStream fis = new FileInputStream("asd");
//		BufferedInputStream bs = new BufferedInputStream(fis);
//		bs.read();
		
		Comonpent2 ac = new Comonpent2();
		//ac.doAnyThing();
		ADecorator ad = new Decorator(ac);
		ad.doAnyThing();
		
	}
}	
