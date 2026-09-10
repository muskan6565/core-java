package com.Aug;
 abstract class Plane{
	 abstract public void takeOff();
	 abstract public void fly();
	 abstract public void land();
}
class CargoPlane extends Plane{
	@Override
	public void takeOff() {
		System.out.println("CargoPlane is takeoff");
	}
	@Override
	public void fly() {
		System.out.println("CargoPlane is flying");
	}
	@Override
	public void land() {
		System.out.println("CargoPlane is landing");
	}
}
class PassengerPlane extends Plane{
	@Override
	public void takeOff() {
		System.out.println("passengerPlane is takeoff");
	}
	@Override
	public void fly() {
		System.out.println("passengerPlane is flying");
	}
	@Override
	public void land() {
		System.out.println("passengerPlane is landing");
	}
}
	class FighterPlane extends Plane{
		@Override
		public void takeOff() {
			System.out.println("FighterPlane is takeoff");
		}
		@Override
		public void fly() {
			System.out.println("FighterPlane is flying");
		}
		@Override
		public void land() {
			System.out.println("FighterPlane is landing");
		}
	
}
public class Abstraction {

	public static void main(String[] args) {
	Plane	p =new FighterPlane();
	p.takeOff();
	p.fly();
	p.land();
		

	}
}


