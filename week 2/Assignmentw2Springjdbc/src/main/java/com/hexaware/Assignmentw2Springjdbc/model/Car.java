package com.hexaware.Assignmentw2Springjdbc.model;

public class Car {
    private int carId;
    private String make;
    private String model;
    private String location;
    private double dailyRate;
    private String status;
    private int passengerCapacity;
    private String specifications;

    // Default constructor
    public Car() {
    }

    // Parameterized constructor
    public Car(int carId, String make, String model, String location, double dailyRate, String status,
                   int passengerCapacity, String specifications) {
        this.carId = carId;
        this.make = make;
        this.model = model;
        this.location = location;
        this.dailyRate = dailyRate;
        this.status = status;
        this.passengerCapacity = passengerCapacity;
        this.specifications = specifications;
    }
    
    // Getters and setters for each property
	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getDailyRate() {
		return dailyRate;
	}

	public void setDailyRate(double dailyRate) {
		this.dailyRate = dailyRate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getPassengerCapacity() {
		return passengerCapacity;
	}

	public void setPassengerCapacity(int passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}

	public String getSpecifications() {
		return specifications;
	}

	public void setSpecifications(String specifications) {
		this.specifications = specifications;
	}

	@Override
	public String toString() {
		return "Car [carId=" + carId + ", make=" + make + ", model=" + model + ", location=" + location
				+ ", dailyRate=" + dailyRate + ", status=" + status + ", passengerCapacity=" + passengerCapacity
				+ ", specifications=" + specifications + "]";
	}

   
}