package com.Aug;
class Demo23
{
	private float bal;
	void setbal(float ba)
	{
		if(ba>0) {
			bal=ba;
		}
	}
	float getbal()
	{
		return bal;
	}	
}


public class Encapsulation1 {

	public static void main(String[] args) {
	Demo23 b = new Demo23();
	b.setbal(1000);
	System.out.println(b.getbal());
	}

}
