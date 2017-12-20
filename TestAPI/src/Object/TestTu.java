package Object;

public class TestTu {
//	1 1 1  2  3
//	    1  1  2
//	
	public static void main(String[] args) {
		System.out.println(getTuCount(16,true));
	}
	
	
//	static int getTuCount(int month){
//		int count1 = 1;
//		int count2 = 1;
//		if(month ==1 || month ==2){
//			return 1;
//		}else{
//			return getTuCount(month-1)+getTuCount(month-2);
//		}
//		 
//	}
	
	static int getTuCount(int month,boolean flag){
		int count ;
		int count1 = 1;
		int count2 = 1;
		
		for (int i = 3; i <=month; i++) {
			count = count2;
			System.out.println("第"+(i-2)+"个月："+count1+","+"第"+(i-1)+"个月："+count2);
			count2 = count1+count2;
			count1 = count;
			
			
		}
		
		return count2;
		 
	}
	
}
