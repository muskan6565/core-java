package com.Aug;
import java.util.Scanner;
public class JaggedArrays2 {

	public static void main(String[] args) {
		
			Scanner	scan =new Scanner(System.in);
			int[][] a=new int[2][];
			a[0]=new int[3];
			a[1]= new int[2];
			int i,j;
			for(i=0;i<a.length;i++) {
				for(j=0;j<a[i].length;j++) {
					
						System.out.println("Enter number for class " + i +
				                   ", sudents" + j );
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


	