package boss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Set;
import java.util.Vector;

import collection.Enumeration_cursor;

public class List {

	public static void main(String[] args) {

//String [] s= {"chetan","akshay","yogesh"};
//ArrayList <String> a1=new ArrayList <String>(Arrays.asList(s));
//System.out.println(a1);
//		
//    
//ArrayList <String> a2=new ArrayList <String>();
//a2.add("mc");
//a2.add("bc");
//a2.add("pc");
//    
//String []s4 =new String[a2.size()];
//a2.toArray(s4);
//for(String ss:s4) {
//	System.out.println(ss);

//	Vector <String> v= new 	Vector <String>();
//		v.add("velocity");
//		v.add("tRaining");
//		v.add("    ");
//		v.add("    ");
//
//		v.add("chamdi vijay");
//		ListIterator <String> e=v.listIterator();
//		while (e.hasNext()){
//			String value = e.next();
//			System.out.println(value);
//		}
//		while (e.hasPrevious()){
//			String value1= e.previous();
//			System.out.println(value1);
//		
//		
//
//		ArrayList<String> a2 = new ArrayList<String>();
//		a2.add("mc");
//		a2.add("bc");
//		a2.add("pc");
//
//		LinkedHashSet<String> h = new LinkedHashSet<String>(a2);
//		h.add("velocity");
//		h.add("velocity");
//		System.out.println(h);
		
		
		//MAP DISCUSSION
		
		LinkedHashMap<Integer,String >h=new LinkedHashMap<Integer,String>();
		h.put(2, "ganesh");
		h.put(3, "chetan");
		h.put(1,"boss");
		
		Set<Integer> key =h.keySet();
		System.out.println(key);
		
	
		Collection<String> c=h.values();
		 System.out.println(c);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		{

		}

	}
}
