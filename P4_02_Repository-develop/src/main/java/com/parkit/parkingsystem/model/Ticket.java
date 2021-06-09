package com.parkit.parkingsystem.model;

import java.util.Calendar;
import java.util.Date;

public class Ticket {
    private int id;
    private ParkingSpot parkingSpot;
    private String vehicleRegNumber;
    private double price;
    private Date inTime;
    private Date outTime;
    private boolean isRecurring;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public String getVehicleRegNumber() {
        return vehicleRegNumber;
    }

    public void setVehicleRegNumber(String vehicleRegNumber) {
        this.vehicleRegNumber = vehicleRegNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getInTime() {
    	if (inTime == null) return null;
    	else return (Date) inTime.clone();
    }

    public void setInTime(Date inTime) {
    	if (inTime == null) this.inTime = null;
    	else this.inTime = (Date) inTime.clone();
    }

    public Date getOutTime() {
    	if (outTime == null) return null;
    	else return (Date) outTime.clone();
    }

    public void setOutTime(Date outTime) {
    	if (outTime == null) this.outTime = null;
    	else this.outTime = (Date) outTime.clone();
    }

	public void setRecurring(boolean recurring) {
		isRecurring = recurring;
	}

	public boolean isRecurring() {
		return isRecurring;
	}
}
