package com.ikubinfo.rental.service.car.dto;

import com.ikubinfo.rental.service.filter.PaginationAndDateFilter;
import lombok.Data;

import java.util.List;

@Data
public class CarFilter extends PaginationAndDateFilter {
    private List<Long> selectedCategoryIds;
    private String startDate = "1900-01-01 00:00:00";
    private String endDate = "1900-01-01 00:00:00";
    private String brand = "";
	public List<Long> getSelectedCategoryIds() {
		return selectedCategoryIds;
	}
	public void setSelectedCategoryIds(List<Long> selectedCategoryIds) {
		this.selectedCategoryIds = selectedCategoryIds;
	}
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
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
    
}
