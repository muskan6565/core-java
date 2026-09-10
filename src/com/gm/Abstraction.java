package com.gm;
import java.util.Scanner;

abstract class Shape{
	public float area; 
	
	abstract public void acceptInput();
	
	abstract public void calcArea();
	
	public void disArea() {
		System.out.println("Area =" + area );
	}
		
	
}

class Square extends Shape{ 
	
	public float radius; 
	
public void acceptInput()
{
Scanner scan = new Scanner(System.in);
System.out.println("enter the radius");
radius =scan.nextFloat();
}
 public void calcArea() {
	 area=radius*radius; 

 }
}

class Rectangle extends Shape{ 
	
	public float length; 
	public float breadth; 
	
public void acceptInput()
{
Scanner scan = new Scanner(System.in);
System.out.println("enter the length");

length =scan.nextFloat();
System.out.println("enter the breadth");
breadth =scan.nextFloat();

}
 public void calcArea() {
	 area=length*breadth; 

 }
}
class Circle extends Shape{ 
	
	public float radi; 
	
	
public void acceptInput()
{
Scanner scan = new Scanner(System.in);
System.out.println("enter the radius");
radi =scan.nextFloat();


}
 public void calcArea() {
	 area=3.143f*radi; 

 }
}

public class Abstraction {

	public static void main(String[] args) {
	Shape r = new Circle();
	r.acceptInput();
	r.calcArea();
	r.disArea();
		

	}

}
