package Collections;

import java.util.Iterator;
//import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class SimpleLinkedList {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add(10);
		ll.add(30);
		ll.add(10.2f);
		ll.add(null);
		ll.add("mussu");
		//ArrayList	al = new ArrayList(ll);
		//System.out.println(al);
		System.out.println(ll);
		System.out.println(ll.peek());
		System.out.println(ll.poll());
		System.out.println(ll);
		ll.offer(60);
		System.out.println(ll);
		System.out.println("using for loop");
		for( int i =0;i<ll.size(); i++) {//accesing the linkedlist using tredition for loop
			System.out.println(ll.get(i));
		}
		System.out.println("using iterator");
		Iterator itr=ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());

		}
		System.out.println("using listiterator");
		ListIterator litr =ll.listIterator(ll.size());//using size() to travel reverse 
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());

		}




	}

}
