package Collection.list;

import java.util.ArrayList;
import java.util.Date;

public class TestArrayList {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(2);
		al.add("$");
		al.add(new Date());
//		System.out.println(al.get(3));
		ArrayList al1 = new ArrayList();
		
		al.add(1, "a");
		al1.add(5);
		al1.add(6);
		al.add("��÷÷");
		al.add("��÷÷");
		al.addAll(al1);
		
//		al.clear();
		System.out.println(al.contains("b"));
		System.out.println(al.indexOf(6));
		System.out.println(al.isEmpty());
		System.out.println(al.remove(2));
		System.out.println(al.remove("$"));//����±��Ԫ���ظ���Ĭ�������±�
		System.out.println(al.set(1, "��÷÷"));
		System.out.println(al.remove("��÷÷"));
		System.out.println(al.toString());
		System.out.println(al.toArray()[1]);
		
		
		
		
		
		System.out.println("�����ķָ���~~~~~~~~~~~~~~~~~~~~~~");
		
//		for (int i = 0; i < al.size(); i++) {
//			System.out.println(al.get(i));
//		}
		
		
//		int a[]  = new int[3];
//		a[0] = 1;
//		a[1] = 1;
//		a[2] = 1;
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}
		
	}
}