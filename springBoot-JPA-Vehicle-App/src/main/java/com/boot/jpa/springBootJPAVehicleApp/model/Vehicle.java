package com.boot.jpa.springBootJPAVehicleApp.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "vehicle_master")
public class Vehicle {

	@Id
	@GeneratedValue
	@Column(name = "vehicle_id")
	private long vehicleId;
	@Column(name = "vehicle_name")
	private String name;
	private String model;
	private double cost;
	@Column(name = "mfg_date")
	@Temporal(TemporalType.DATE)
	private Date date;

	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

	public Vehicle(long vehicleId, String name, String model, double cost, Date date) {
		super();
		this.vehicleId = vehicleId;
		this.name = name;
		this.model = model;
		this.cost = cost;
		this.date = date;
	}

	public long getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(long vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", name=" + name + ", model=" + model + ", cost=" + cost + ", date="
				+ date + "]";
	}

}
