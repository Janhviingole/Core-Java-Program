package com.janhvi;

interface ATM1{
	void withdraw();
	void show();
	
}
class axis implements ATM1{
	public void withdraw() {
		System.out.println("Money withdraw Successfully");
	}
	public void show() {
		System.out.println("Hello");
	}
}

public class InterfaceDemo {
	public static void main(String[] args) {
		axis a = new axis();
		a.withdraw();
	}

}
