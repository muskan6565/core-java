package com.Aug;

import java.util.Scanner;

public class Arrays3 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int[][][] a = new int[2][3][5];
		int i,j,k;
		for(i=0;i<a.length;i++) {
			for(j=0;j<a[i].length;j++) {
				for(k=0;k<a[i][j].length;k++) {
					System.out.println("Enter number for class " + i +
			                   ", section " + j + ", student " + k);
				a[i][j][k]=scan.nextInt();
			}
		}
	}
		System.out.println("numbers areee");
		for(i=0;i<a.length;i++) {
			for(j=0;j<a[i].length;j++) {
				for(k=0;k<a[i][j].length;k++) {
				System.out.print(a[i][j][k]+ " ");
			}System.out.println();

		}System.out.println();
		
	}
}

}
