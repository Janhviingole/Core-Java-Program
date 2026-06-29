package com.janhvi;
//runtime polymorphism
//method overriding
class Women{
	public void work() {
		System.out.println("Women is Working");
	}
}
class Teacher extends Women {
	public void work() {
		System.out.println("Teacher is Teaching");
	}
}

public class PolymorphismDemo2 {
	public static void main(String[] args) {
		Women w= new Women();
		w.work();
		

	}

}
