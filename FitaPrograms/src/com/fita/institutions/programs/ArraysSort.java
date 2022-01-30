package com.fita.institutions.programs;

import java.util.Arrays;

public class ArraysSort {

	public static void main(String[] args) {
		int[] numArr = {5,3,7,6,9};
		Arrays.sort(numArr);
		for(int i = 0; i < numArr.length; i++)
		{
			System.out.println(numArr[i]);
		}
		
//		for(int i : numArr) {
//			System.out.println(i);
//		}
		

	}

}
