package com.usa.javapractice;

public class Para_Method {
	
	public int subNumbers(int a , int b){
		int sub=a-b; 
		System.out.println("subtraction result is  " +  sub);
		return sub;
	}
	
	public int addNumbers(int b, int c, double d) {
		double add = (b + c + d);
		System.out.println("addition result is " + add);
		return 0;
			}
	
	public  static void mulNumbers( int e, int f, int g) {
		int mul = e * f * g;
		System.out.println("multiplication result is " + mul);
	}
	public static void divNumbers(int j, double k) {
		
		double div = j/k;
		System.out.println("division result is " + div);
	}
	
	
	public static void main(String[] args) {
		
		Para_Method obj1 =	new Para_Method ();  //Object obj1 creation 
		
		
		obj1.subNumbers(50,20);    
		obj1.addNumbers(10, 25, 20.55);
		Para_Method.mulNumbers(5, 8 ,2);        //static method, so no need to create object. just call by class name.
		Para_Method.divNumbers(25, 8);
	
	
	}
	

}
