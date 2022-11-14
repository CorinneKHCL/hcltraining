package com.kleinman.proxypractice;

public class RealInternetAccess implements OfficeInternetAccess {  
    private String employeeName;  
    public RealInternetAccess(String empName) {  
        this.employeeName = empName;  
    }  
    @Override  
    public void grantInternetAccess() {  
        System.out.println("Internet Access granted for employee: "+ employeeName);  
    }
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return employeeName;
	} 
    
    
}  