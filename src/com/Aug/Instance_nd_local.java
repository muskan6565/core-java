package com.Aug;
class Demo1{
	int a;
	float b;
	boolean c;
	void demo()
	{
		System.out.println("default values assinged by JVM");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("end of instance variables");
	}
	
}

public class Instance_nd_local {

	public static void main(String[] args) {
		Demo1 d= new Demo1();
		d.demo();
		int c=10;
		System.out.println(c);
		
	}

}
