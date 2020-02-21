package com.example.restdemo.springrestexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.restdemo.springrestexample.model.Employee;
import com.example.restdemo.springrestexample.service.MyService;

@RestController
@RequestMapping("/employeeApp")
public class MyController {

	@Autowired
	MyService service;

	@RequestMapping("/employees")
	public List<Employee> getEmployees() {
		return service.getEmployees();
	}

	@RequestMapping("/employees/{id}")
	public Employee getEmployee(@PathVariable int id) {
		return service.getEmployee(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/employees")
	public boolean addEmployee(@RequestBody Employee employee) {
		return service.addEmployee(employee);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/employees/{id}")
	public List<Employee> updateEmployee(@RequestBody Employee employee, @PathVariable int id) {
		return service.updateEmployee(employee, id);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/employees/{id}")
	public List<Employee> deleteEmployee(@PathVariable int id) {
		return service.deleteEmployee(id);
	}

}
