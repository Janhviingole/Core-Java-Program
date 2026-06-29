package com.janhvi;

public class ExceptionHandlingDemo {
	 public static void main(String[] args) {
		 int x = 10;
			int y = 0;
			try {
				int result = 10/0;
				System.out.println(result);
				
			} catch (Exception e) {
				System.out.println("Cannot divide by zero");
			}

	}
	

}
