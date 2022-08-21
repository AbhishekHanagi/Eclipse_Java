package com.xworkz.method;

public class IntegerCreate 
{
	public static void main(String[] args) 
	{
		// Integer constructor--

		Integer value = new Integer("10");
		System.out.println(value);

		Integer value2 = new Integer(20);
		System.out.println(value2);
		
		System.out.println("-------------");

		// Integer instance method--

		Integer name = value.hashCode();
		System.out.println(name);

		float name1 = value.floatValue();
		System.out.println(name1);

		int name2 = value.intValue();
		System.out.println(name2);

		long name3 = value.longValue();
		System.out.println(name3);

		double name4 = value.doubleValue();
		System.out.println(name4);

		byte name5 = value.byteValue();
		System.out.println(name5);

		int name6 = value.compareTo(12);
		System.out.println(name6);

		boolean name7 = value.equals(22);
		System.out.println(name7);

		short name8 = value.shortValue();
		System.out.println(name8);

		String name9 = value.toString();
		System.out.println(name9);
		
		System.out.println("--------------");

		// Integer static method--

		Integer ab = Integer.min(12,15);
		System.out.println(ab);

		Integer bc = Integer.sum(10, 15);
		System.out.println(bc);

		Integer cd = Integer.max(12,24);
		System.out.println(cd);
		
		Integer de = Integer.divideUnsigned(24,8);
		System.out.println(de);
		   
		Integer ef = Integer.sum(12,18);
		System.out.println(ef);
		
		Integer fg = Integer.highestOneBit(20);
		System.out.println(fg);
		
		Integer gh = Integer.valueOf(20);
		System.out.println(gh);
		
		Integer hi = Integer.reverseBytes(24);
		System.out.println(hi);
		
		Integer ij = Integer.parseUnsignedInt("26");
		System.out.println(ij);
		
		Integer jk = Integer.reverse(28);
		System.out.println(jk);
		
		Integer kl = Integer.lowestOneBit(53);
		System.out.println(kl);
	}
}

