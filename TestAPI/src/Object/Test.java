package Object;

public class Test {
	public static void main(String[] args) {
//		 int a = 1;
//		 int sum = 1;
//		 while(a<=5){
//			 sum = sum*a;
//			 a++;
//		 }
//		 System.out.println(sum);
		System.out.println(getN(5));
	}
	
	static int getN(int a){
		if(a==1){
			return 1; 
		}else{
			return a*getN(a-1);
		}
	}
	
	
	
}
