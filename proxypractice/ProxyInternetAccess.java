package com.kleinman.proxypractice;

public class ProxyInternetAccess implements OfficeInternetAccess {  
    private String employeeName;  
    private int role;
    private RealInternetAccess  realaccess;  
        public ProxyInternetAccess(String employeeName, int role) {  
     this.employeeName = employeeName;  
     this.role = role;
 }  
        
 @Override  
 public void grantInternetAccess()   
 {  
     if (getRole() > 4)   
     {  
         realaccess = new RealInternetAccess(employeeName);  
         realaccess.grantInternetAccess();  
     }   
     else   
     {  
         System.out.println("No Internet access granted. Your job level is below 5");  
     }  
 }  
 public String getName() {
	 return this.employeeName;
 }
 public int getRole() {  
     // Check role from the database based on Name and designation  
     // return job level or job designation.  
     return this.role;  
 }  
 public void setRole(int role) {
	 this.role = role;
 }
}  
