package com.Sep;
interface OperatingSystem{
	void boot();
	void shutDown();
	default void update() {
		System.out.println("updating new version");
	}
}
class Mac implements OperatingSystem{
	@Override
	public void boot() {
		System.out.println("Mac is booting");

	}
	@Override
	public void shutDown() {
		System.out.println("mac is shutdowing!!");

	}
	@Override
	public void update() {

		System.out.println("mac is updating");
	}

}


class Windows implements OperatingSystem{
	@Override
	public void boot() {
		System.out.println("Windows is booting");

	}
	@Override
	public void shutDown() {
		System.out.println("Windows is shutdowing!!");
	}
	@Override
	public void update() {

		System.out.println("Windows is updating");
	}

}


public class Interface {

	public static void main(String[] args) {
		OperatingSystem myop =	new Mac ();
		myop.boot();
		myop.shutDown();
		myop.update();

	}

}
