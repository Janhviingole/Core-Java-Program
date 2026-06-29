package com.janhvi;


class Students{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
public class EncapsulationDemo {
	public static void main(String[] args) {
		Students s = new Students();
		s.setName("janhvi");
		s.setAge(25);
		
		System.out.println(s.getName());
		System.out.println(s.getAge());
		
	}
	
	 
}
