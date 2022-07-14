package com.samble;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class collectionset {
	public static void main(String[] args) {
		
		 Set<Integer> a=new LinkedHashSet<>();
		 
			a.add(10);
			a.add(20);
			a.add(30);
			a.add(40);
			a.add(50);
			
			System.out.println(a);
			
			Set<Integer> a1=new TreeSet<>();
			
			a1.add(100);
			a1.add(200);
			a1.add(300);
			a1.add(400);
			a1.add(500);
			
			System.out.println(a1);
			
			Set<Integer> a2=new HashSet<>();
			  a2.add(10);
			  a2.add(200);
			  a2.add(30);
			  a2.add(400);
			  a2.add(50);
			  
			System.out.println(a2);
			
			
	}
		
		 
	}

