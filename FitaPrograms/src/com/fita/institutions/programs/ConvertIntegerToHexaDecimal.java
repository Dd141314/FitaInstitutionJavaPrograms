package com.fita.institutions.programs;

public class ConvertIntegerToHexaDecimal {
	

	public static int[] decimalToBinary(int n) {
		int binaryNum[] = {};
		for(int i = 0 ; n > 0 ; i++) {
			binaryNum[i] = n % 2;
			n = n/2;
		}
		return binaryNum;
	}
	
	public static void main(String[] args) {
		int requestNumber = 479;
		int[] resultBinaryArray = decimalToBinary(requestNumber);
		System.out.println(resultBinaryArray);
//        String hex = Integer.toHexString(i);
//        System.out.println("Hex value: "+hex);
	}

}
