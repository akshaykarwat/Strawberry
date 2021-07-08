package string;

public class encapsulation {

	private int balance = 1000;

	public double getbalance() {

		System.out.println( this.balance);
		return balance;
	}
	
	
   public void setbalance(int amount) {

		this.balance=balance+amount;
	System.out.println(balance);
	}
   
   public static void main(String[] args) {
	   encapsulation en=new encapsulation();
	   en.getbalance();
	   en.setbalance(200);


   stringpractice  ss= new stringpractice();
   ss.m1();
}}
