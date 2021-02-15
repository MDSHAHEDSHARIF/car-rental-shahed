package com.ikubinfo.rental.service.reservation.dto;

import com.ikubinfo.rental.service.filter.PaginationAndDateFilter;
import lombok.Data;

@Data
public class ReservationFilter extends PaginationAndDateFilter {
    private String startDate = "1900-01-01 00:00:00";
    private String endDate = "2900-01-01 00:00:00";
    private String carName = "";
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
    
}
