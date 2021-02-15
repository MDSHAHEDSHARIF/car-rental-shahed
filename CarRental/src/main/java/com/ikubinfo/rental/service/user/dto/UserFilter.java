package com.ikubinfo.rental.service.user.dto;

import lombok.Data;

@Data
public class UserFilter {
    private int startIndex;
    private int pageSize;
    private String name = "";
	public int getStartIndex() {
		return startIndex;
	}
	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    
}
