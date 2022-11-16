package com.LambdaPractice;

interface Addable{  
    int add(int a,int b);  
}  
  
public class LambdaExpressionExample5{  
    public static void main(String[] args) {  
          
        // Multiple parameters in lambda expression  
        Addable ad1=(a,b)->(a+b);  
        System.out.println(ad1.add(30,20));  
          
        // Multiple parameters with data type in lambda expression  
        Addable ad2=(int a,int b)->(a+b);  
        System.out.println(ad2.add(140,200));  
    }  
}  