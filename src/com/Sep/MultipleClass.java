package com.Sep;

interface Plane
{
	void takeOff();
	void flying();
}
class Plane2{
	void landing()
	{
		System.out.println("plane is landing");
	}
}
class PassPlane extends Plane2  implements Plane{

	public void takeOff() {
		System.out.println("passenger plane is take offing");
	}
	public void flying() {
		System.out.println("passenger plane is flying");
	}

}

public class MultipleClass {

	public static void main(String[] args) {
		PassPlane p=new PassPlane();
		p.takeOff();
		p.flying();
		p.landing();
	}

}
