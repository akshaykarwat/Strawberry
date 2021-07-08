package akshya1;

import java.util.LinkedHashSet;
import java.util.Set;

public class aa {

	public static void main(String[] args) {
//		String s="akshay";
//		String rev="";
//	 
//		int length=s.length();
//		
//		for( int i=length-1;i>=0;i--) {
//		 rev=rev+s.charAt(i);
//		}
//		System.out.println(rev);
	
		String m="oooooommmmmmmmmmkkkkkkkkkkkaaaaaaaaarrrrrrr";
		StringBuilder sb4=new StringBuilder();
		Set<Character>set=new LinkedHashSet();
		for(int i=0;i<m.length();i++) {
			set.add(m.charAt(i));
		}
		for(Character c:set) {
			sb4.append(c);
			
		}
		System.out.println(sb4);
		
		
		
		

	}

}
