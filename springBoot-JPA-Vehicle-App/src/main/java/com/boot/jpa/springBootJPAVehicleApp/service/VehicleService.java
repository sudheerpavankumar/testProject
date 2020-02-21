package com.boot.jpa.springBootJPAVehicleApp.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.jpa.springBootJPAVehicleApp.dao.VehicleRepository;
import com.boot.jpa.springBootJPAVehicleApp.model.Vehicle;

@Service
@Transactional
public class VehicleService {

	@Autowired
	VehicleRepository repository;

	public List<Vehicle> getVehicles() {

		List<Vehicle> list = new ArrayList<>();

		Iterable<Vehicle> iterable = repository.findAll();

		for (Vehicle vehicle : iterable) {
			list.add(vehicle);
		}
		return list;
	}

	public Vehicle getVehicleById(long id) {
		return repository.findById(id).get();
	}

	public List<Vehicle> deleteVehicle(long id) {
		return repository.deleteByVehicleId(id);
	}

	public List<Vehicle> getModelsByName(String name) {
		return repository.getByName(name);
	}

	public Vehicle addVehicle(Vehicle vehicle) {
		return repository.save(vehicle);
	}

	public Vehicle updateVehicle(Vehicle vehicle, long id) {
		return repository.save(vehicle);
	}

}
