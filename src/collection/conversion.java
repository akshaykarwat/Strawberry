package collection;

import java.util.ArrayList;
import java.util.Arrays;

public class conversion {

	public static void main(String[] args) {
		
		
		//Array to ArrayList or collection
		
		
//		String s[]= {"prasad","breakup with","roshani"};
//		                                                            
//		ArrayList<String> w= new ArrayList<String>(Arrays.asList(s));
//		System.out.println(w);
		
		
		 //[prasad, breakup with, roshani]

		//======================================================================
		
		//conversion arraylist to array
		ArrayList<String> al= new ArrayList<String>();
		al.add("abc");
		al.add("def");
		String str[]=new String[al.size()];
		
		al.toArray(str);
		for(String ss:str) {
			System.out.println(ss);
		}
		
		
		
	}

}
