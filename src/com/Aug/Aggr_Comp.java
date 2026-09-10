package com.Aug;

class Charger{
	void displayCharger()
	{
		System.out.println("in the charger");
	}
}
class Os
{
	void displayOs()
	{
		System.out.println("in the os");
	}
}
class Mobail
{
	Charger charger;
	Os os;
	 Mobail(Charger charger)
	{
	    os = new Os();
		this.charger=charger;
	}
	 void display3()
	 {
		 os.displayOs();
		 charger.displayCharger();
	 }
}
public class Aggr_Comp {

	public static void main(String[] args) {
		 Charger c	=new  Charger();
	Mobail m	= new Mobail(c);
	m.display3();
		
		

	}

}
