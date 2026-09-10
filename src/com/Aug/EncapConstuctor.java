package com.Aug;
class Day23
{
	private int id;
	private String name;
	private float salary;
	Day23()
	{
		this(2, "naffu", 100000);
		id=1;
		name="muskan";
		salary=200000;
		
	}
	Day23(int id,String name,float salary)
	{
		
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public int getid()
	{
		return id;
	}
	
	public String getname()
	{
		return name;
	}
	
	public float getsalary()
	{
		return salary;
	}



}

public class EncapConstuctor {

	public static void main(String[] args) {
		Day23 d = new Day23();
		
		System.out.println(d.getid());
		System.out.println(d.getname());
		System.out.println(d.getsalary());
		

	}

}
