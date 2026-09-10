package com.Aug;
import java.util.Scanner;
public class Arrays {

	public static void main(String[] args) {
Scanner	scan =new Scanner(System.in);
int[] a=new int[5];

int i;
          for(i= 0;i<a.length;i++) {
        	  System.out.println("enter a number");
        	  a[i]= scan.nextInt();
        	 }
          System.out.println("numbers aree");
          for(i=0;i<a.length;i++){
        	  System.out.print(a[i] + " ");
        	  
          }
		
	}

}
