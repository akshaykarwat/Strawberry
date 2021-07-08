package collection;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {

//		ArrayList al= new ArrayList();
//		al.add("akshay");
//		al.add("9763868370");
//		al.add("poco f1");
//		System.out.println(al);
//		

//		ArrayList<String> al = new ArrayList<String>();
//		   al.add("AKSHAY");
//		     al.add(123);--->not vallid
//		         al.add("VINAYAK");
//		          al.add("ASHA");
//		          al.add("KARWATKAR");
//		          al.add("roshan");
//		            System.out.println(al);

		           // [AKSHAY, VINAYAK, ASHA, KARWATKAR]

		          //==================================================================
		                                      // al here
//		ArrayList<String> al2 = new ArrayList<String>(al);
//		                   al2.add("IS");
//		                     al2.add("FAMILY");

		                  // System.out.println(al2);
		                 // [AKSHAY, VINAYAK, ASHA, KARWATKAR, IS, FAMILY]

		//============================================================================
	//	al2.remove(0)
//	al2.remove("IS");	
		//System.out.println(al2);
		//[AKSHAY, VINAYAK, ASHA, KARWATKAR, FAMILY]
		
		//===================================================================
		
//		al.set(3, "golu");
		//System.out.println(al);
		//[AKSHAY, VINAYAK, ASHA, golu, roshan]
//======================================================================
		
		
		
//		al2.clear();
		
		//=========================================================
		
//		boolean value = al2.isEmpty();
//		System.out.println(value);
		
		
		//============================================
		//TO GET SIZE
		
		
		
                   
		ArrayList<String> al = new ArrayList<String>();
		   al.add("AKSHAY");
		     // al.add(123);--->not vallid
		         al.add("VINAYAK");
		          al.add("ASHA");
		          al.add("KARWATKAR");
                    
                    
		      	ArrayList<String> al2 = new ArrayList<String>();
                al2.add("IS");
                  al2.add("FAMILY");
                  
                  
              	ArrayList<String> al3 = new ArrayList<String>();
                  al3.addAll(al);
                  al3.addAll(al2);
                  al3.add("HOME");
                  al3.add("MY SWEET HOME");
                 System.out.println(al3); 
                 
                 
                   int allsize = al3.size();
                 
                 System.out.println(allsize);
                 
                 //[AKSHAY, VINAYAK, ASHA, KARWATKAR, IS, FAMILY, HOME, MY SWEET HOME]
                 //8
                 
                 
                 
                 //
                 
		
	}

}
