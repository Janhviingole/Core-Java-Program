package com.janhvi;

class Emp{
	private int employeeId;
	private String employeeName;
	private double salary;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
public class EncapculationEmp {
	public static void main(String[] args) {
		Emp e = new Emp();
		e.setEmployeeId(1);
		e.setEmployeeName("Janhvi");
		e.setSalary(1000.00);
		
		System.out.println(e.getEmployeeId());
		System.out.println(e.getEmployeeName());
		System.out.println(e.getSalary());
	}

}
