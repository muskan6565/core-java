package com.Aug;
class Day21
{
	private int id;
	private String name;
	private float salary;
	public void setid(int id)
	{
		this.id=id;
	}
	public int getid()
	{
		return id;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public String getname()
	{
		return name;
	}
	public void setsalary(float salary)
	{
		this.salary=salary;
	}
	public float getsalary()
	{
		return salary;
	}



}

public class Shadowing {

	public static void main(String[] args) {
	Day21 d	=new Day21();
	d.setid(1);
	d.setname("muskan");
	d.setsalary(200000);
	System.out.println(d.getid());
	System.out.println(d.getname());
	System.out.println(d.getsalary());
	
		

	}

}
