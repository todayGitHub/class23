package Date;

import java.util.Calendar;
import java.util.Date;

public class Test1 {
	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		Date d = new Date(new Date().getTime());
		c.setTime(d);
		

	}
}
