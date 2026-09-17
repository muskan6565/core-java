package com.Sep;
interface Calcalator{
	void add(int a,int b);
	void sub(int a,int b);
}
class Cal2 implements Calcalator {
	@Override
	public void add(int a,int b) {
		System.out.println("sum="+ (a+b));

	}
	@Override
	public void sub(int a,int b) {
		System.out.println("sub="+ (a-b));

	}
	public void mul(int a,int b) {
		System.out.println("mul="+ (a*b));
	}
}
class Cal3 extends Cal2{

}

public class Interface2 {

	public static void main(String[] args) {
		Cal2 c = new Cal3();

		c.add(20, 50);
		c.sub(80, 30);
		c.mul(40,50);
	}

}
