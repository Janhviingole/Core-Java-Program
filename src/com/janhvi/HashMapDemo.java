package com.janhvi;

import java.util.HashMap;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<Integer, String> students = new HashMap<Integer, String>();
		students.put(101,"rahul");
		students.put(102, "vishal");
		students.put(103, "amit");
		students.put(104,"rahul");
		System.out.println(students);
		// automatic sorting a numerbs
		HashMap<Integer, String> studentss = new HashMap<Integer, String>();
		studentss.put(104,"rahul");
		studentss.put(103, "vishal");
		studentss.put(102, "amit");
		studentss.put(101,"rahul");
		System.out.println(studentss);
		 
	}

}
