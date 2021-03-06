package Collection.list;

//实现iterator方法，能够返回一个Iterator接口实现类的对象
//这个接口有两个 方法 hasNext() ,next()

public class ArrayList {
	
	private Object [] element = new Object[10];
	private int Maxindex =-1;
		
	public int size(){
		return Maxindex+1;
	}
	
	public Object get(int index){
		return element[index];
	}
	
	public void  AddList(){
		Object [] elementNew = new Object[element.length*3/2];
		for (int i = 0; i < element.length; i++) {
			elementNew[i] = element[i];
		}
		element = elementNew;
	}
	
	public void set(int index, Object o){
		element[index ] = o;
	}
	public void add(Object o){
		if(isFull()){
			 AddList();
		}
		element[++Maxindex]= o;				
	}
	
	public boolean isEmpty(){
		if(size()==0){
			return true;
		}else{
			return false;
		}
		
	}
	
	
	public boolean isFull(){
		if(size()==element.length){
			return true;
		}else{
			return false;
		}
	}
	
	
	public Iterator iterator(){
		
		return new X();
	}
	
	
	class X implements Iterator{
		private int index = 0;
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			if(index <= Maxindex){
				return true;
			}else{
				return false;
			}			
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			return element[index++];
		}

	}
}



