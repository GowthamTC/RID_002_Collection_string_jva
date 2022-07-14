package com.samble;

import java.util.ArrayList;
import java.util.List;

public class CollectionList {
	public static void main(String[] args) {
		List li=new ArrayList();
		
		li.add(40);
		li.add("Amar");
		li.add(123456789);
		li.add(98765432);
		li.add(true);
		li.add('g');
		
		System.out.println(li);
		
		int size = li.size();
		System.out.println(size);
		
		Object j = li.get(2);
		System.out.println(j);
		
		System.out.println("Normal forloop");
		for (int i = 0; i < li.size(); i++) {
			
			Object r = li.get(i);
			System.out.println(r);
		
			for (Object g : li) {
				System.out.println(g);
				
			}
			
		}
		
		
				
	}

}
