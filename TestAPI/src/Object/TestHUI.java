package Object;

import java.util.Scanner;

public class TestHUI {
	public static void main(String[] args) {
		System.out.println("������1����");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int  i = 1;
		int  j = 1;
		while(true){
			if(x/(10*i)== 0){
				break;
			}
			i*=10;
			j++;
		}
	
		int [] array = new int[j];
		boolean flag = true;
		
		for (int k = 0,q=1; k <array.length ; k++,q*=10) {
			array[k]= x/q%10;
			//System.out.println(array[k]);
		}
		for (int k = 0; k < array.length; k++) {
			if(array[k]!=array[array.length-k-1]){
				System.out.println("ƭ�Ӳ��ǻ�����");
				flag = false;
				break;
			}
		}
		if(flag == true){
			System.out.println("������");
		}
	}
}
