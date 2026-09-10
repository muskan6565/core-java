package com.Aug;

public class Strings1 {

	public static void main(String[] args) {
	String s1= "java";         //stores in string constant pool in heap segment and without any duplicates
	String s2= new String("jaVa");     //stores in  heap segment which can allow duplicates
	if(s1==s2) 
	{
		System.out.println("ref are equal");
	}
	else
	{
		System.out.println("ref are not equal");
	}
	if(s1.equals(s2))
	{
		System.out.println("values are equal");
	}
	else
	{
		System.out.println("values are not equal");
	}
	if(s1.equalsIgnoreCase(s2))//compare two values without considering its case
	{
		System.out.println("values are equal");
	}
	else
	{
		System.out.println("values are not equal");
	}
			

	}

}
