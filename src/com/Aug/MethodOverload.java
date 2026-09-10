package com.Aug;

class Demo22
{
	int add(int a,int b)
	{
	 int sum=a+b;
	 return sum;
	}
	int add(int a,int b,int c)
	{
	 int sum=a+b+c;
	 return sum;
	}
}

public class MethodOverload {

	public static void main(String[] args) {
	Demo22 d= new Demo22();
	int res=d.add(100, 200,300);
	System.out.println(res);
		

	}

}
