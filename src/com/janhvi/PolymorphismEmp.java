package com.janhvi;

class Employees{
	public void work() {
		System.out.println("Employee is working");
	}
}
class Developer extends Employees{
	public void work() {
		System.out.println("Developer is working");
	}
}
public class PolymorphismEmp {
	public static void main(String[] args) {
		Employees e = new Employees();
		e.work();
	}

}
