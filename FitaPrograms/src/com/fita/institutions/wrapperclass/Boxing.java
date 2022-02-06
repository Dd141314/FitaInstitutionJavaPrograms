package com.fita.institutions.wrapperclass;

public class Boxing {

	public static void main(String[] args) {
		byte b=10;  
		short s=20;  
		int i=30;  
		long l=40;  
		float f=50.0F;  
		double d=60.0D;  
		char c='a';  
		boolean b2=true; 
	
		
		/** Boxing or Wrapping Techniques */
		Byte bObj = new Byte(b);
		System.out.println(bObj);
		
		Short sObj = new Short(s);
		System.out.println(sObj);
		
		Integer iObj = new Integer(i);
		System.out.println(iObj);
		
		Long lObj = new Long(l);
		System.out.println(lObj);
		
		Float fObj = new Float(f);
		System.out.println(fObj);
		
		Double dObj = new Double(d);
		System.out.println(dObj);
		
		Character cObj = new Character(c);
		System.out.println(cObj);
		
		Boolean b2Obj = new Boolean(b2);
		System.out.println(b2Obj);
		
		
	}

}
