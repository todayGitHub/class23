package Integer;

public class Test {
	public static void main(String[] args) {
	
		Integer i1 = new Integer("110000");
		Integer i2 = new Integer(13);
		System.out.println(i1.compareTo(i2));
		System.out.println(i1.intValue()>i2.intValue());
		System.out.println(Integer.parseInt("f",16)+1);
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		System.out.println(i1.equals(i2));
		System.out.println(i1.toBinaryString(18));
		System.out.println(i1.toHexString(18));
		System.out.println(Integer.toOctalString(18));
		System.out.println(Integer.valueOf(13).equals(new Integer(13)));
		
		
		
		
		
	}
}
