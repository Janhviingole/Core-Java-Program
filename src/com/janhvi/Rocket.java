package com.janhvi;

class FuelLoading extends Thread {
	public void run() {
		try {
			System.out.println("Fuel Loading Starting...");
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}

class WeatherCheck extends Thread {
	public void run() {
		try {
			System.err.println("Checking weather");
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
 
class NavigationSystem extends Thread {
	public void run() {
		try {
			System.out.println("Starting Navigation System...");
			Thread.sleep(4000);
			System.out.println("Navigation Ready");
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}

public class Rocket {
	public static void main(String[] args) {
		FuelLoading t1 = new FuelLoading();
		WeatherCheck t2 = new WeatherCheck();
		NavigationSystem t3 = new NavigationSystem();
		
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
