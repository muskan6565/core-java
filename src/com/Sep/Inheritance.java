package com.Sep;

class Father{
	public void brownEye() {
	System.out.println("father have brown eyes");
}
}
class Child extends Father{
	public void thickHair() {
		System.out.println("childs have thick hairs");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		Child  c=new Child();
		c.brownEye();
		c.thickHair();
		
		

	}

}
