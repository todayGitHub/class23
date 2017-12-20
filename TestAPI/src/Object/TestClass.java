package Object;

public class TestClass {
	public static void main(String[] args) {
		//Object o = new Object();
		try {
			Class.forName("java.lang.Object");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(o.getClass());
	}
}
