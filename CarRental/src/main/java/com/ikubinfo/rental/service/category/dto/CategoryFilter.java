package com.ikubinfo.rental.service.category.dto;

import lombok.Data;

@Data
public class CategoryFilter {
    private int startIndex;
    private int pageSize;
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
    
}
