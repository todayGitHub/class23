package com.neuedu.oopfour;

public class BankAccount {
	String name;
	double balance;
	int year;
	double rate = 0.01;
	public BankAccount() {
		
		super();
		this.balance = 10;
		this.year = 1;
	}
	public BankAccount(double balance, int year) {
		super();
		this.balance = balance;
		this.year = year;
	}
	
	
	public void save(double balance){
		this.balance = this.balance+ balance;
	}
	
	
	public void fetch(double balance){
		if(balance> this.balance){
			System.out.println("Ç®²»¹»");
		}else{
			this.balance = this.balance - balance;
		}
	}
	
	public double calcTotal(){
		double result = this.balance;
		
		for (int i = 1; i <= this.year; i++) {
			result = result*(1+this.rate);
		}
		return result;
	}
	
	public static void main(String[] args) {
		BankAccount tom = new BankAccount(1000,3);
		tom.save(2000);
		System.out.println(tom.calcTotal());
	}
	
	
}
