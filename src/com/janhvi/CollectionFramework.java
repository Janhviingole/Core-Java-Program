package com.janhvi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class CollectionFramework {
	public static void main(String[] args) {
		
		
		
		ArrayList<String> Student = new ArrayList<String>();
			Student.add("Amit");
			Student.add("Janhvi");
			Student.add("Mitali");
			System.out.println(Student);
			
	
			LinkedList<Integer> rollNo = new LinkedList<Integer>();
			rollNo.add(10);
			rollNo.add(20);
			rollNo.add(30);
			System.out.println(rollNo);
			
			
			Vector<String> names = new Vector<String>();
			names.add("Akshay");
			names.add("Rahul");
			names.add("Messi");
			System.out.println(names);
	}

}


