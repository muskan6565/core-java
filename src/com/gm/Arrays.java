package com.gm;
import java.util.Scanner;
public class Arrays {
	

	    public static void main(String[] args) {

	        Scanner scan = new Scanner(System.in);

	        System.out.print("Enter number of elements: ");
	        int n = scan.nextInt();

	        int[] arr = new int[n];

	        System.out.println("Enter " + n + " elements:");

	        for(int i = 0; i < n; i++) {           
	            arr[i] = scan.nextInt();             
	        }

	        int largest = arr[0];                  
	        for(int i = 1; i < arr.length; i++) {  
	            if(arr[i] > largest) {            
	                largest = arr[i];              
	            }
	        }

	        System.out.println("Largest number is: " + largest);  

	      
	    }
	}