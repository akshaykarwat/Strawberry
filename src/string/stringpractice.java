package string;

public class stringpractice {
	
	
	protected void m1() {
		System.out.println("akshya");
	}

	public static void main(String[] args) {
		

		StringBuffer sa = new StringBuffer("akshay");
		sa.append("balak");
		System.out.println(sa);

		String s = "balak";
		char k = s.charAt(3);
		System.out.println(k);

		String ss = "balak";
		String kk = ss.toUpperCase();
		System.out.println(kk);

		String sss = "balak";
		String kkk = ss.toLowerCase();
		System.out.println(kkk);

		String x = "balak";
		String m = x.concat("akshay");
		System.out.println(m);

		String xx = "balak";
		String mm = "boss";
		boolean kl = xx.equals(mm);
		System.out.println(kl);

		String xxx = "balak";
		String mmm = "boss";
		boolean p = xxx.contentEquals(mmm);
		System.out.println(p);

		String po = "akshaykarwatkar1544646484";
		String h = po.substring(2);
		System.out.println(h);

		String poo = "akshaykarwatkar1544646484";
		String ppp = "akshaykarwatkar1544646484";
		boolean ssss = poo.equalsIgnoreCase(ppp);
		System.out.println(ssss);

		String pooo = "akshaykarwatkar1544646484";
		boolean l = poo.contains("akshay");
		System.out.println(l);

		String q = "akshaykarwatkar1544646484";
		String i = q.substring(1, 6);
		System.out.println(i);

		String qq = "akshaykarwatkar1544646484";
		String ssssss = qq.replace("a", "z");
		System.out.println(ssssss);

		String qqq = "akshaykarwatkar1544646484";
		String a = qq.replace("aks", "zzz");
		System.out.println(a);

		String r = "akshay";
		int aa = r.indexOf("s");
		System.out.println(aa);

		String t = "abcdef";
		char[] rr = t.toCharArray();
		for (char y : rr) {
			System.out.println(y);
		}

		String xxxc = "    balak    ";
		String mmc = xxxc.trim();
		System.out.println(mmc);

		
		
		String ssx="Akshay akshay akshay";
		String su []=ssx.split(" ");
		for(String hh:su) {
			System.out.println(hh);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
