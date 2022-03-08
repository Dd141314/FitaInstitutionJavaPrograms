package com.fita.institutions.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ListExamples {

	public static void main(String[] args) {
		List li=new ArrayList();
		li.add(3333);
		li.add("mayekar");
		li.add(77.888);
		li.add(true);
		li.add(299999999L);
		li.add('c');
		li.add(null);
		li.add(null);
		li.add("mayekar");
		li.add(1, "test1");
		li.add(0,"test0");
		li.add(2,"test2");
		System.out.println(li);
		
		List li1=new ArrayList();
		li1.add(0,"test0");
		li1.add(1, "test1");
		li1.add(2,"test2");
		System.out.println(li1);

		List vectorList = new Vector<>();
		vectorList.add(1);
		System.out.println(vectorList);
		
		


	}

}
