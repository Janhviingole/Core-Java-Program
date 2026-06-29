package com.janhvi;

public class EmpConst {
	EmpConst(){
		System.out.println("Default Employee");
	}
	EmpConst(String name){
		System.out.println("Emp Name:"+ name);
		
	}
	EmpConst(String name,int age){
		System.out.println("Emp Name:" +name);
		System.out.println("Age:"+ age);
	}
	public static void main(String[] args) {
		EmpConst obj1 = new EmpConst();
		EmpConst obj2 = new EmpConst("janhvi");
		EmpConst obj3 = new EmpConst("esha",21);
		
	}
}
