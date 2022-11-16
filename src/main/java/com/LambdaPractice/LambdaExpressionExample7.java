package com.LambdaPractice;

import java.util.*;  
public class LambdaExpressionExample7{  
    public static void main(String[] args) {  
          
        List<String> list=new ArrayList<String>();  
        list.add("Cheezit");  
        list.add("Fini");  
        list.add("Comma");  
        list.add("Jocey");  
          
        list.forEach(  
            (n)->System.out.println(n)  
        );  
    }  
}  