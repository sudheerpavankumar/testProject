package com.example.restdemo.springrestexample.model;

public class Employee {

	private int id;
	private String name;
	private String desig;
	private double salary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, String desig, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.desig = desig;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesig() {
		return desig;
	}

	public void setDesig(String desig) {
		this.desig = desig;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
