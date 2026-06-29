package com.janhvi;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> names = new LinkedList<String>();
		
		names.add("Rahul");
		names.add("Leo");
		names.add("Rehan");
		
		System.out.println(names.peek());
		System.out.println(names);
	}
                                             
}
