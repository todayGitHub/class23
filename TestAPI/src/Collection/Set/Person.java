package Collection.Set;

public class Person implements Comparable{
	String name;
	double money;
	
	
	
	public Person(String name, double money) {
		super();
		this.name = name;
		this.money = money;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Person p = null;
		if(o instanceof Person){
			p = (Person)o;
		}
		if(this.money>p.money){
			return 1;
		}else if(this.money == p.money){
			return 0;
		}else{
			return -1;
		}
		
	}

	
}
