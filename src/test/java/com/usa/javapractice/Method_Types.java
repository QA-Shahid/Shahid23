package com.usa.javapractice;

public class Method_Types {
	
	public void getEmployee() {
		System.out.println("Employee name is Mike");    // This is void method 
		
	}
	
    public static  int getSalary() {                          //This is a return static  method
		return 12000;
		
		
    	
    }
    
    public String getName() {                     //this one also return method 
		return null;
    	
    }
    
    public void getTotal( int salary, int bonus) {    //This is parameterized method 
    	System.out.println(salary + bonus);
    	
    }
    
	
	
	
	

	public static void main(String[] args) {
		
		
		Method_Types obj1 =new Method_Types();
		obj1.getEmployee();
		
		System.out.println(Method_Types.getSalary());
        
         
         obj1.getTotal(12000, 2500);
		
	}

}
