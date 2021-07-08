package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Enumeration_cursor {

	public static void main(String[] args) {

		Vector<String> al = new Vector<String>();

		al.add("velocity");
		al.add("akshay");

//		Enumeration<String> e = al.elements();
//
//		while (e.hasMoreElements()) {
//			String value = e.nextElement();
//			System.out.println(value);
			
			
			//iterator
	
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			String value1=itr.next();
			if(value1.equals("velocity")) {
				itr.remove();
			}
			System.out.println(value1);
		}
		System.out.println(al);
			
//		velocity
//		akshay
//		[akshay]

			
			
			
			
			
			
		}

	}


