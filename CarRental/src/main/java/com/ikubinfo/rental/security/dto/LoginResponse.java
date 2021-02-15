package com.ikubinfo.rental.security.dto;

import com.ikubinfo.rental.service.user.dto.UserModel;
import lombok.Data;

@Data
public class LoginResponse {

    private String jwt;
    private UserModel user;
	public String getJwt() {
		return jwt;
	}
	public void setJwt(String jwt) {
		this.jwt = jwt;
	}
	public UserModel getUser() {
		return user;
	}
	public void setUser(UserModel user) {
		this.user = user;
	}

}
