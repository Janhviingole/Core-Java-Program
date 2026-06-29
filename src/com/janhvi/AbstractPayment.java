package com.janhvi;

abstract class Payment{
	abstract void pay();
}

class UPIPayment extends Payment{
	void pay() {
		System.out.println("Payment Successfully");
	}
}
public class AbstractPayment {
	Payment p = new UPIPayment();
	
}
