package com.xworkz.java;

public class CharcterCreate
{
	public static void main(String[] args) 
	{
		// charcter type constructor--

		Character name = new Character('A');
		System.out.println(name);

		System.out.println("--------------");

		// character type instance method--

		char ab = name.charValue();
		System.out.println(ab);

		int bc = name.compareTo('B');
		System.out.println(bc);

		boolean cd = name.equals('c');
		System.out.println(cd);

		int de = name.hashCode();
		System.out.println(de);

		String ef = name.toString();
		System.out.println(ef);

		System.out.println("--------------");

		// character type static method--

		int fg = Character.charCount(2);
		System.out.println(fg);

		char gh = Character.toTitleCase('B');
		System.out.println(gh);

		byte hi = Character.getDirectionality('N');
		System.out.println(hi);

		int ij = Character.compare('A', 'B');
		System.out.println(ij);

		boolean jk = Character.isDefined('K');
		System.out.println(jk);

		int kl = Character.getNumericValue('L');
		System.out.println(kl);

		int lm = Character.toCodePoint('c', 'D');
		System.out.println(lm);

		char mn = Character.toLowerCase('G');
		System.out.println(mn);

		char no = Character.toUpperCase('q');
		System.out.println(no);

		char pq = Character.reverseBytes('U');
		System.out.println(pq);

		boolean qr = Character.isTitleCase('M');
		System.out.println(qr);
	}
}
