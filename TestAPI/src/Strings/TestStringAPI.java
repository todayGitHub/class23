package Strings;

public class TestStringAPI {
	public static void main(String[] args) {
		String s1 = new String("ASSDDsd12   3123@@1    ");
		
		//������
		//�޲�
		//ͨ���ַ����鴴��
		//ͨ���ַ��������ַ���
		//ͨ���ֽ����鴴�� ����
		
		//�������ܸı�ֵ��StringBuffer��StringBuilder
		//������   appened   toString
		
		
		//����ƪ
		System.out.println("��".compareTo("��"));
		System.out.println(s1.concat("123"));
		
		//�ַ�����������
		System.out.println(s1.replace("a", "x"));
		System.out.println(s1.substring(1,4));
		String s [] = s1.split("@");
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.trim());
		
		//�ַ�����Ϣ
		System.out.println(s1.isEmpty());
		System.out.println(s1.length());
		System.out.println(s1.equals("abc"));
		System.out.println(s1.equalsIgnoreCase("ABc"));
		
		//�ַ���ת������
		char c [] = s1.toCharArray();
		byte b [] = s1.getBytes();
		
		
		//�ַ���������� �ַ����±�
		System.out.println(s1.charAt(1));
		System.out.println(s1.charAt(2));
		System.out.println(s1.indexOf("ab"));
		System.out.println(s1.indexOf("a",0));
		System.out.println(s1.lastIndexOf("a"));		
		System.out.println(s1.contains("b"));
		System.out.println(s1.endsWith("abc"));
		System.out.println(s1.startsWith("ab"));
		
		
		System.out.println(s1.hashCode());
		
		
		
		
		
		
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		
		
		
		
		//System.out.println(s1.valueOf("123"));
		
		
		
		
		
		
		
	}

}