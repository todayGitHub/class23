package Strings;

public class TestString {
	public static void main(String[] args) {
		//String s ; // �ַ��� �ֽ������� = �ַ�������
		String s1 = "123";
		String s2 = new String("123");
		String s3 = new String("123");
		System.out.println(s3 == s1);
		System.out.println(s2.intern() == s3.intern());
		
		
	}
}
