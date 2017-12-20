package com.neuedu.oopfour;

public class Cola {
	public static void main(String[] args) {
		ColadEmployee c[] = {new HourlyEmployee("小时工1", 3, 180, 20),
				new HourlyEmployee("小时工2", 10, 180, 20),
				new HourlyEmployee("小时工3", 3, 150, 20),
				new SalariedEmployee("固定工1",10,5000 ) ,
				new SalariedEmployee("固定工2",9,5000 ) ,
				new SalesEmployee("销售1", 10,1000000,0.01),
				new SalesEmployee("销售2", 8,1000000,0.01)};
		int month =10;
		for (int i = 0; i < c.length; i++) {
			Company.print(month, c[i]);
		}
	}
}

class ColadEmployee{
	
	private String name;
	private int Birthday_month;
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getBirthday_month() {
		return Birthday_month;
	}



	public void setBirthday_month(int birthday_month) {
		Birthday_month = birthday_month;
	}



	public ColadEmployee(String name, int birthday_month) {
		super();
		this.name = name;
		Birthday_month = birthday_month;
	}



	public double getSalary(int month){
		if(month == this.Birthday_month){
			System.out.println("happy birthday ,给100块"+this.Birthday_month);
			return 100;
		}else{
			return 0;
		}
		
	}
}

class SalariedEmployee extends ColadEmployee{
	
	


	public SalariedEmployee(String name, int birthday_month, double month_sal) {
		super(name, birthday_month);
		this.month_sal = month_sal;
	}

	

	private double month_sal;

	@Override
	public double getSalary(int month) {
		// TODO Auto-generated method stub
		return month_sal+super.getSalary(month);
	}
	
	
		
}

class HourlyEmployee extends ColadEmployee{
	
	public HourlyEmployee(String name, int birthday_month, int hour,
			double hour_sal) {
		super(name, birthday_month);
		this.hour = hour;
		this.hour_sal = hour_sal;
	}
	
	private  int hour;
	private  double hour_sal;
	@Override
	public double getSalary(int month) {
		// TODO Auto-generated method stub
		double month_sal = 0;
		if(hour<=160){
			month_sal = hour*hour_sal;
		}else{
			month_sal = hour_sal*160+ hour_sal*1.5*(hour-160);
		}
		return month_sal+super.getSalary(month);
	}
	
	
	
	
	
}

class SalesEmployee extends ColadEmployee{

	public SalesEmployee(String name, int birthday_month, double sumSAL,
			double lv) {
		super(name, birthday_month);
		this.sumSAL = sumSAL;
		this.lv = lv;
	}

	private double sumSAL;
	private double lv;
	@Override
	public double getSalary(int month) {
		// TODO Auto-generated method stub
		return sumSAL*lv+super.getSalary(month);
	}
	
}

class Company{
	static void print(int month,ColadEmployee e){
		System.out.println(e.getName()+"员工"+e.getSalary(month));
		System.out.println("~~~~~~~~~~华丽的分割线~~~~~~~~~~~~~");
	}
}