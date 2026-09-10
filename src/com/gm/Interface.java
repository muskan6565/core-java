package com.gm;

interface Calculator{
	public void sum(int a,int b);
	public void sub(int a,int b);
	default void mul(int a,int b)
	{
		System.out.println("mul=" + (a*b));	
	}
	default void div(int a,int b)
	{
		System.out.println("divi=" + (a/b));	
	}
}
interface Calculator2{
	public void endoftheline();
		
	default public void multiInterface() {
		System.out.println("it is a multi interface");
		
     }
	
}

class MyCalculator1 implements Calculator,Calculator2
{
	public void sum(int a, int b) {
		System.out.println("add1=" + (a+b));
	}
	public void sub(int a, int b) {
		System.out.println("sub1=" + (a-b));
		}
	public void endoftheline() {
		System.out.println("it is end of the calculation!!!!!");
	}
	
}

public class Interface {

	public static void main(String[] args) {
		MyCalculator1 c1 =new MyCalculator1();
		c1.sum(20, 40);
		c1.sub(20, 40);
		c1.mul(2,3);
		c1.div(6,2);
		c1.endoftheline();
		

	}

}
