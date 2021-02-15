package com.ikubinfo.rental.service.reservation.dto;

import com.ikubinfo.rental.service.reservation.dto.ReservationModel;
import lombok.Data;

import java.util.List;

@Data
public class ReservationPage {

    private Long totalRecords;
    private List<ReservationModel> reservationList;
	public Long getTotalRecords() {
		return totalRecords;
	}
	public void setTotalRecords(Long totalRecords) {
		this.totalRecords = totalRecords;
	}
	public List<ReservationModel> getReservationList() {
		return reservationList;
	}
	public void setReservationList(List<ReservationModel> reservationList) {
		this.reservationList = reservationList;
	}
    
}
