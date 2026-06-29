package com.janhvi;

public class MethodDemo {
	//default method
	public void siri() {
		System.out.println("Hey How Are "
				+ "You");
	}
	//Parameter with argument method
	public void add(int a,int b) {//parameter
		System.out.println(a+b);
	}
	//method with return type
	static int square(int n) {
		return n*n;
	}
	//basic program even and odd with methods
	static void checkEvenOdd(int n) {
		if(n % 2==0) {
			System.out.println("Even");
		}else {
			System.out.println("odd");
		}
	}
	

	public static void main(String[] args)
	{
		MethodDemo obj = new MethodDemo();
		obj.siri();
		obj.siri();
		obj.add(12,15);//Arguments
		System.out.println(square(5));
		obj.checkEvenOdd(8);
	}
}
