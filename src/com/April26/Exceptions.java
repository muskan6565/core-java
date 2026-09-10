package com.April26;
import java.util.Scanner;

public class Exceptions {

	public static void main(String[] args) {
		Scanner	scan = new Scanner(System.in);
		
        try
        {
        	
        	 System.out.println("enter the first interger values");
     		int a=scan.nextInt();
     	     System.out.println("enter the second interger values");
     	     int b=scan.nextInt();
              System.out.println("add =" + (a+b));
              System.out.println("sub =" + (a-b));
              System.out.println("multi =" + (a*b));
              System.out.println("div =" + (a/b));
        }
        catch(Exception e)
        {
        	System.out.println("complete temination");
        }
	}

}
