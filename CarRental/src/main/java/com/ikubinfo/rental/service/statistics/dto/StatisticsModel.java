package com.ikubinfo.rental.service.statistics.dto;

import lombok.Data;

@Data
public class StatisticsModel {

    private Long availableCars;
    private Long rentedCars;
    private Long activeUsers;
    private Long newBookings;
	public Long getAvailableCars() {
		return availableCars;
	}
	public void setAvailableCars(Long availableCars) {
		this.availableCars = availableCars;
	}
	public Long getRentedCars() {
		return rentedCars;
	}
	public void setRentedCars(Long rentedCars) {
		this.rentedCars = rentedCars;
	}
	public Long getActiveUsers() {
		return activeUsers;
	}
	public void setActiveUsers(Long activeUsers) {
		this.activeUsers = activeUsers;
	}
	public Long getNewBookings() {
		return newBookings;
	}
	public void setNewBookings(Long newBookings) {
		this.newBookings = newBookings;
	}
    
}
