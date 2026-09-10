package com.Aug;
class Demo11
{
	int add(int... a)  //int... is a variable type argument and it is also called as array
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(a[1]);
		return sum;
	}
}

public class VariableTypeArug {

	public static void main(String[] args) {
     Demo11 d =new Demo11();
     int res=d.add(10,20,40,344,678);
     System.out.println(res);

	}

}
