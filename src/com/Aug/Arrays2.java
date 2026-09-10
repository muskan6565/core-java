package com.Aug;
import java.util.Scanner;

public class Arrays2 {

	public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	int[][] a = new int[2][5];
	int i,j;
	for(i=0;i<a.length;i++) {
		for(j=0;j<a[i].length;j++) {
			System.out.println("enter a number"+ j);
			a[i][j]=scan.nextInt();
		}
	}
	System.out.println("numbers areee");
	for(i=0;i<a.length;i++) {
		for(j=0;j<a[i].length;j++) {
			System.out.print(a[i][j]+ " ");
		}System.out.println();

	}
	
	}

}
