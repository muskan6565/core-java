package com.gm;

class Family
{
public void	father()
{
	System.out.println("************");
	System.out.println("    father name is:\n     chand");
}
public void	mother()
{
	System.out.println("***********");
	System.out.println("    mother name is:\n     fathima");
	
}

	
}
class Children extends Family
{
	{
	System.out.println("**//welcome to our family//**");
	System.out.println("    childrens name are:\n     NAFISA\n     MUSKAN\n     SHAKSHAVLI");
	}
	
}

public class Inheritance {
	public static void main(String[] args) {
		
	
       Children c =new Children();
	c.father();
	c.mother();
}
}
