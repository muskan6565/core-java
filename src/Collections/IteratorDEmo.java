package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class IteratorDEmo {

	public static void main(String[] args) {
		ArrayList	al = new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		al.add(600);
		System.out.println(al);
		Iterator itr=al.iterator();
		
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		System.out.println(al);
		 ListIterator itr2 =al .listIterator(al.size());

	        while (itr2.hasPrevious()) {
	            System.out.println(itr2.previous());
	        }

	}

}
