package com.boot.jpa.springBootJPAVehicleApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boot.jpa.springBootJPAVehicleApp.model.Vehicle;
import com.boot.jpa.springBootJPAVehicleApp.service.VehicleService;

@RestController
public class VehicleController {

	@Autowired
	VehicleService service;

	@RequestMapping("/getVehicles")
	public List<Vehicle> getVehicles() {
		return service.getVehicles();
	}

	@RequestMapping("/getVehicles/{id}")
	public Vehicle getVehicle(@PathVariable long id) {
		return service.getVehicleById(id);
	}

	@RequestMapping(value = "/getVehicles/{id}", method = RequestMethod.DELETE)
	public List<Vehicle> deleteVehicle(@PathVariable long id) {
		return service.deleteVehicle(id);
	}

	@RequestMapping(value = "/getVehicles/vehicle/{name}", method = RequestMethod.GET)
	public List<Vehicle> getModelsByName(@PathVariable String name) {
		return service.getModelsByName(name);
	}
	
	@RequestMapping(value = "/getVehicles/addVehicle", method = RequestMethod.POST)
	public Vehicle addVehicle(@RequestBody Vehicle vehicle) {
		return service.addVehicle(vehicle);
	}
	
	@RequestMapping(value = "/getVehicles/updateVehicle/{id}", method = RequestMethod.PUT)
	public Vehicle updateVehicle(@RequestBody Vehicle vehicle,@PathVariable long id) {
		return service.updateVehicle(vehicle,id);
	}
	
	

}
