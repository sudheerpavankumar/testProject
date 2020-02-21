package com.example.restdemo.springrestexample.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.restdemo.springrestexample.model.Employee;

@Service
public class MyService {

	static List<Employee> employees = new ArrayList<>();

	static {
		employees.add(new Employee(123, "pavan", "consultant", 45678));
		employees.add(new Employee(124, "sudheer", "sr.consultant", 45678));
		employees.add(new Employee(125, "kumar", "sr.consultant", 45678));
		employees.add(new Employee(126, "shawwali", "manager", 45678));
		employees.add(new Employee(127, "kalyan", "HR", 45678));
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public Employee getEmployee(int id) {
		return employees.stream().filter(e -> e.getId() == id).findFirst().get();
	}

	public boolean addEmployee(Employee employee) {
		return employees.add(employee);
	}

	public List<Employee> updateEmployee(Employee employee, int id) {

		for (int i = 0; i < employees.size(); i++) {
			if (employees.get(i).getId() == id) {
				employees.set(i, employee);
			}
		}

		return employees;
	}

	public List<Employee> deleteEmployee(int id) {

		//employees.removeIf(e -> e.getId() == id);
		
		Iterator<Employee> iterator = employees.iterator();
		while (iterator.hasNext()) {
			Employee employee = iterator.next();
			if(employee.getId() == id) {
				iterator.remove();
			}
		}
		return employees;
	}

}
