package Integer;

public class TestValueOf {
	public static void main(String[] args) {
		Integer i1 = new Integer(111);
		Integer i2 = new Integer(111);
		Integer i3 = new Integer(222);
		Integer i4 = new Integer(222);
		Integer i5 = new Integer("111");
		Integer i6 = new Integer("111");
		Integer i7 = new Integer("222");
		Integer i8 = new Integer("222");
		Integer i11 = Integer.valueOf(22);
		Integer i12 = Integer.valueOf(22);
		Integer i13 = Integer.valueOf(222);
		Integer i14 = Integer.valueOf(222);
		Integer i15 = Integer.valueOf("111");
		Integer i16 = Integer.valueOf("111");
		Integer i17 = Integer.valueOf("333");
		Integer i18 = Integer.valueOf("333");
		
		System.out.println(i1 ==i2);
		System.out.println(i1 ==i11);
		System.out.println(i1 ==i15);
		System.out.println(i3 ==i15);
		System.out.println(i3 ==i8);
		System.out.println(i3 ==i14);
		System.out.println(i3 ==i17);
		System.out.println(i3 ==i4);
		System.out.println(i7 ==i8);
		System.out.println(i11 ==i12);
		System.out.println(i17 ==i18);
		System.out.println(i15 ==i16);
		
	}
}
