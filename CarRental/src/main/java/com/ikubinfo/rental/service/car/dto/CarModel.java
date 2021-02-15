package com.ikubinfo.rental.service.car.dto;

import com.ikubinfo.rental.service.category.dto.CategoryModel;
import com.ikubinfo.rental.service.reservation.dto.ReservedDates;
import com.ikubinfo.rental.service.car.status.StatusEnum;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Data
public class CarModel {

    private Long id;
    private String name;
    private String type;
    private MultipartFile file;
    private String plate;
    private double price;
    private String diesel;
    private String description;
    private int year;
    private CategoryModel category;
    private Long categoryId;
    private byte[] photo;
    private List<ReservedDates> reservedDates;
    private StatusEnum availability;
    private boolean active;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public MultipartFile getFile() {
		return file;
	}
	public void setFile(MultipartFile file) {
		this.file = file;
	}
	public String getPlate() {
		return plate;
	}
	public void setPlate(String plate) {
		this.plate = plate;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDiesel() {
		return diesel;
	}
	public void setDiesel(String diesel) {
		this.diesel = diesel;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public CategoryModel getCategory() {
		return category;
	}
	public void setCategory(CategoryModel category) {
		this.category = category;
	}
	public Long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	public List<ReservedDates> getReservedDates() {
		return reservedDates;
	}
	public void setReservedDates(List<ReservedDates> reservedDates) {
		this.reservedDates = reservedDates;
	}
	public StatusEnum getAvailability() {
		return availability;
	}
	public void setAvailability(StatusEnum availability) {
		this.availability = availability;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
    
}
