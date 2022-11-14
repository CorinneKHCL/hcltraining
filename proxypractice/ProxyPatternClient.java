package com.kleinman.proxypractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProxyPatternClient {  
    public static void main(String[] args)   
    {  
    	List<OfficeInternetAccess> users = new ArrayList<OfficeInternetAccess>();
    	Scanner scan = new Scanner(System.in);
 
    	
        OfficeInternetAccess access = new ProxyInternetAccess("Cheezit", 2);  
        users.add(access);
        access = new ProxyInternetAccess("Triscuit", 9);  
        users.add(access);
        access = new ProxyInternetAccess("Comma", 14);  
        users.add(access);
        access = new ProxyInternetAccess("Hastings", 13);  
        users.add(access);
        access = new ProxyInternetAccess("Fini", 20);  
        users.add(access);
        access = new ProxyInternetAccess("Madison", 21);  
        users.add(access);
      
        do {
           	int count = 1;
        	System.out.println("Choose the number next to a name from the list \nbelow to see who has been granted access:\n(-1 to exit)");
        	for(OfficeInternetAccess user:users) {
        		System.out.println(count + ". " + user.getName());
        		count++;
        	}
        	int choice = scan.nextInt() - 1;
        	OfficeInternetAccess user = users.get(choice);
        	user.grantInternetAccess();
        } while(scan.nextInt() != -1);  
        
        scan.close();
    }
}  