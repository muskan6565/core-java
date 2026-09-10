package com.April26;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception2 {
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
	              System.out.println("multi =" + (a/b));
	              scan.close();
	        }
	        catch(InputMismatchException e)
	        {
	        	System.out.println("give the interger value");
	              System.out.println("complete the termination");
	        }
	        catch(ArithmeticException f)
	        {
	        	System.out.println("give the non-zero input");
	        	System.out.println("complete the termination");
	        }
	        catch(Exception g)
	 	        {
	 	        	System.out.println("something problem");
	 	        	System.out.println("complete the termination");
	 	        }
	        }
	        
		}

	
