package com.boot.jpa.springBootJPAVehicleApp.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.boot.jpa.springBootJPAVehicleApp.model.Vehicle;

public interface VehicleRepository extends CrudRepository<Vehicle, Long> {

	public List<Vehicle> deleteByVehicleId(long id);
	
	public List<Vehicle> getByName(String name);
}
