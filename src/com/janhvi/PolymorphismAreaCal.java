package com.janhvi;

class AreaCalculator{
	public void area(int side) {
		System.out.println(side*side);
	}
	public void area(int length,int breadth) {
		System.out.println(length*breadth);
	}
}

public class PolymorphismAreaCal {
	public static void main(String[] args) {
		AreaCalculator c = new AreaCalculator();
		c.area(3);
		c.area(4,5);
	}

}
