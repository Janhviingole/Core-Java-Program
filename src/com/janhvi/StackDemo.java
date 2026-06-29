package com.janhvi;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<String> books = new Stack<String>();
		books.push("Java");
		books.push("Python");
		books.push("C++");
		System.out.println("Books in stack:" + books);
		
		// top book
		
		System.out.println("Top Books:" + books.peek());
		
		// Remove books 
		
		System.out.println("Remove Book:" + books.pop());
		
		//Remaining books
	
		System.out.println("Remaining books " + books );
	}

}
