package com.ikubinfo.rental.service.car.dto;

import java.util.List;

import com.ikubinfo.rental.service.car.dto.CarModel;
import lombok.Data;

@Data
public class CarsPage {
	private Long totalRecords;
	private List<CarModel> carsList;
	public Long getTotalRecords() {
		return totalRecords;
	}
	public void setTotalRecords(Long totalRecords) {
		this.totalRecords = totalRecords;
	}
	public List<CarModel> getCarsList() {
		return carsList;
	}
	public void setCarsList(List<CarModel> carsList) {
		this.carsList = carsList;
	}
	
}
