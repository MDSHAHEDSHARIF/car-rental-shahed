package com.ikubinfo.rental.service.user.dto;


import lombok.Data;

import java.util.List;

@Data
public class UserPage {

    private Long totalRecords;
    private List<UserModel> userList;
	public Long getTotalRecords() {
		return totalRecords;
	}
	public void setTotalRecords(Long totalRecords) {
		this.totalRecords = totalRecords;
	}
	public List<UserModel> getUserList() {
		return userList;
	}
	public void setUserList(List<UserModel> userList) {
		this.userList = userList;
	}
    
}
