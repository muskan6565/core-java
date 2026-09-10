package com.gm;

class Demo {
	static int a ,b;
	int x,y;

	static
	{
		System.out.println("inside the static block:");
		a=10;
		b=20;
	}

	static void fun1()
	{
		System.out.println("inside the static methode:");
		System.out.println(a);
		System.out.println(b);
	}


	{
		System.out.println("inside the instance block:");
		x=55;
		y=66;
		System.out.println(x);
		System.out.println(y);
	}
	public void fun2()
	{
		System.out.println("inside the instance methode:");
		a=699;
		b=599;
		System.out.println(a);
		System.out.println(b);
	}


	Demo()
	{
		System.out.println("inside the constructor");
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
	}

}
public class StaticEx
{
	public static void main(String[] args) {
		Demo.fun1();
		Demo s =new Demo();
		s.fun2();
	}

}


