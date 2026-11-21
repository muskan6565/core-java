package Collections;

import java.util.ArrayList;

public class ArrayListCounting {

	public static void main(String[] args) {
		ArrayList	al = new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		al.add(600);
		System.out.println(al.size());
		System.out.println(al);
		al.add(4, 350);
		System.out.println(al);
		System.out.println(al.get(5));//to get value
		al.set(6, "muskan");//to set value
		System.out.println(al);
		System.out.println(al.size());
		ArrayList	al2 = new ArrayList();
		al2.add(900);
		al2.add(200);
		al2.add(3030);
		al2.add(400);
		al2.add(5060);
		System.out.println("in second array list " +al2.size());
		System.out.println(al2);
		al.removeAll(al2);//removes the dublicates
		System.out.println(al);
		al.retainAll(al2);//displays the dublicates
		System.out.println(al +" retain");
		System.out.println("in first array list " +al.size());
		System.out.println("in second array list " +al2.size());
		
	}

}
