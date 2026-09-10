package com.Aug;
class Day22
{
	private int id;
	private String name;
	private float salary;
	public void setdata(int id,String name,float salary)
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


public class Encapsulation2 {

	public static void main(String[] args) {
		Day22 d = new Day22();
		d.setdata(1, "muskan", 200000);
		System.out.println(d.getid());
		System.out.println(d.getname());
		System.out.println(d.getsalary());
		
		
	}

}
