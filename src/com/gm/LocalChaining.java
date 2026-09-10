package com.gm;

public class LocalChaining {
	
private String name;
private int age;
public void setName(String name){
    this.name=name;
}
public void setAge(int age){
	this.age=age;// TODO Auto-generated method stub
}
public String getName() {
	return name;
}
public int getAge() {
	return age;
}
	public static void main(String[] args) {
		LocalChaining l = new LocalChaining();
		l.setName("muskan");
		l.setAge(20);
		System.out.println(l.getName());
		System.out.println(l.getAge());
	}

}
