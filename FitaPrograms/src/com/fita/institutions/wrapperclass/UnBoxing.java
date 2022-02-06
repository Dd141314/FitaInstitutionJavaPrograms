package com.fita.institutions.wrapperclass;

public class UnBoxing {

	public static void main(String[] args) {
		
		byte b;  
		short s;  
		int i;  
		long l;  
		float f;  
		double d;  
		char c;  
		boolean b2;  
		
		Byte bObj = new Byte((byte) 10);
		Short sObj = new Short((short) 20);
		Integer iObj = new Integer(30);
		Long lObj = new Long(40);
		Float fObj = new Float(50.0F);
		Double dObj = new Double(60.0D);
		Character cObj = new Character('a');
		Boolean b2Obj = new Boolean(true);
		
		/** UnBoxing  */
		b = bObj.byteValue();
		System.out.println(b);
		
		s = sObj.shortValue();
		System.out.println(s);
		
		i = iObj.intValue();
		System.out.println(i);
		
		l = lObj.longValue();
		System.out.println(l);
		
		f = fObj.floatValue();
		System.out.println(f);
		
		d = dObj.doubleValue();
		System.out.println(d);
		
		c = cObj.charValue();
		System.out.println(b);
		
		b2 = b2Obj.booleanValue();
		System.out.println(b2);

	}

}
