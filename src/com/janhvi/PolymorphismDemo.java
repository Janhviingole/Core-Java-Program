package com.janhvi;

class Calculator{
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	
	public void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
}
public class PolymorphismDemo {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.add(5, 4);
		c.add(6,7,8);
	}

}
