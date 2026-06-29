package com.janhvi;

abstract class ATM{
	abstract void withdraw();
	
}
class HDFC extends ATM {
	void withdraw() {
		System.out.println("Money withdraw Successfully");
	}
}

public class AbstractionDemo {
	public static void main(String[] args) {
		ATM a = new HDFC();
		a.withdraw();
		
	}

}
