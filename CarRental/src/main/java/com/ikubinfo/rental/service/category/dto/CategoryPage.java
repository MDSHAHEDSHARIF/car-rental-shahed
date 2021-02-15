package com.ikubinfo.rental.service.category.dto;

import com.ikubinfo.rental.service.category.dto.CategoryModel;
import lombok.Data;

import java.util.List;

@Data
public class CategoryPage {

    private Long totalRecords;
    private List<CategoryModel> categoryList;
	public Long getTotalRecords() {
		return totalRecords;
	}
	public void setTotalRecords(Long totalRecords) {
		this.totalRecords = totalRecords;
	}
	public List<CategoryModel> getCategoryList() {
		return categoryList;
	}
	public void setCategoryList(List<CategoryModel> categoryList) {
		this.categoryList = categoryList;
	}

}
