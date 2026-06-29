package com.janhvi;
//Single Inheritance
class Dad{
	public void House() {
		System.out.println("1Cr");
	}
	public void car() {
		System.out.println("Skoda");
	}
}

public class Child extends Dad {
	public static void main(String[] args) {
		Child Akshay = new Child();
		Akshay.House();
		Akshay.car();
	}

}
