package Object;

public class TestEquals {
	public static void main(String[] args) {
		Student s  = new Student("tom", 1);
		s = null;
		System.gc();
		
		
		
	}
}

class Student{
	int id;
	char sex;
	String name;
	int age;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + sex;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		
		return true;
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println(name+"退学了");
	}
	
	void hehe(){
		System.out.println(name+"退学了");
	}
	
}
