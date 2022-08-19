package com.xworkz.java;

public class BooleanCreate 
{
	public static void main(String[] args) 
	{
		// boolean type constructor

		Boolean name1 = new Boolean(true);
		System.out.println(name1);

		Boolean name2 = new Boolean("home");
		System.out.println(name2);

		// boolean type instance method--

		boolean ab = name1.booleanValue();
		System.out.println(ab);

		boolean bc = name1.equals("state");
		System.out.println(bc);

		int cd = name1.compareTo(true);
		System.out.println(cd);

		int de = name1.hashCode();
		System.out.println(de);

		String ef = name1.toString();
		System.out.println(ef);

		// boolean static mathod--

		boolean fg = Boolean.getBoolean("bat");
		System.out.println(fg);

		int gh = Boolean.compare(true, false);
		System.out.println(gh);

		boolean hi = Boolean.getBoolean("State");
		System.out.println(hi);

		int ij = Boolean.hashCode(true);
		System.out.println(ij);

		boolean jk = Boolean.logicalAnd(true, true);
		System.out.println(jk);

		boolean kl = Boolean.logicalOr(true, false);
		System.out.println(kl);

		boolean lm = Boolean.logicalXor(false, false);
		System.out.println(lm);

		boolean mn = Boolean.parseBoolean("home");
		System.out.println(mn);

		boolean no = Boolean.valueOf(true);
		System.out.println(no);

		String pq = Boolean.toString(true);
		System.out.println(pq);
	}
}
