package Collections;

import java.util.ArrayList;

public class BoxingAndUnboxing {

	public static void main(String[] args) {
		ArrayList	al = new ArrayList();
		al.add(new Integer(100));
		al.add(new Thread());
		al.add(new Exception());
		al.add(new String("Mussu"));
		
		System.out.println(al);
	}

}
