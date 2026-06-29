package com.janhvi;


class BoilWater extends Thread {
	public void run() {
		System.out.println("Boiling water");
		try {
			Thread.sleep(5000);
			System.out.println("water is boiling");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class HeatMilk extends Thread {
	public void run() {
		System.out.println("Heating Milk");
		try {
			Thread.sleep(5000);
			System.out.println("Milk is boiling");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class GrindCoffe extends Thread {
	public void run(){
		System.out.println("Grinding coffe");
	}
}

public class CoffeeMachine {
	public static void main(String[] args) {
		BoilWater t1 = new BoilWater();
		HeatMilk t2 = new HeatMilk();
		GrindCoffe t3 = new GrindCoffe();
		
		 t1.start();
		 t2.start();
		 t3.start();
		 
		 try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		
	}

}
