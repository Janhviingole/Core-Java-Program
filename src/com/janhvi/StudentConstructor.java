package com.janhvi;

public class StudentConstructor {
	StudentConstructor(){
		System.out.println("Default");
	}
	StudentConstructor(String name){
		System.out.println("Name:"+ name);
	}
	StudentConstructor(String name,int age){
		System.out.println("Name:"+ name);
		System.out.println("Age"+ age);
	}
	public static void main(String[] args) {
		StudentConstructor obj1 =new StudentConstructor();
		StudentConstructor obj2 =new StudentConstructor("janhvi");
		StudentConstructor obj3 =new StudentConstructor("esha",21);
		
	}

}
