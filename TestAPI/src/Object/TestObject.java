package Object;

public class TestObject {
	public static void main(String[] args) {
		Object o = new Object();
//		int [] i = new int [10];
//		int a = 1;
//		String s = o+"";
//		Person p = new Person();
//		System.out.println(p);
//		System.out.println(o);
//		
//		System.out.println(o.toString());
//		
//		if(o == o.toString()){
//			System.out.println("һ��");
//		}
//		getClass().getName() + '@' + Integer.toHexString
//		System.out.println(o.getClass().getName());
//		System.out.println(o);
		
		//Integer.toHexString(hashCode())
//		System.out.println(Integer.toHexString(1000));
//		//3e8
//		//001111101000
//		System.out.println(Integer.toHexString(o.hashCode()));
//		System.out.println(o);
		
		
//		printObjject(new Person());
		
		
		Person p1 = new Person();
		Person p2 = new Person();
		System.out.println(p1.equals(p2));
		//System.out.println(p1 == p1);
	}
	
	static void printObjject(Object o){		
		System.out.println(o);
	}
}

class Dog{
	char sex = '��';

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "������������һֻ"+sex+"��";
	}
	
}
class Person{
	
	String name ="haha";
	int sfz = 111;
	String dna= "һ������haha��dna";
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "�������࣬�ҵ�������"+name;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Person){
			if(this.sfz== ((Person)obj).sfz){
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
		
		
	}
	
	
	
}