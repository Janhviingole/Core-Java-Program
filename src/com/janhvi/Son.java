package com.janhvi;
//Multilevel inheritance
class grandfather{
	public void plot() {
		System.out.println("5Cr");
	}
}

class father extends grandfather{
	public void car() {
		System.out.println("BMW");
	}
}
public class Son extends father {

	public static void main(String[] args) {
		 Son rahul = new Son();
		 rahul.plot();
		 rahul.car(); 

	}

}
