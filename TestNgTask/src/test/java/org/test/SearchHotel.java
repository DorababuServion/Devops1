package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends StepDefinition {
	
	public SearchHotel() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement locatio;
	
	@FindBy(id="hotels")
	private WebElement hotel;
	
	@FindBy(id="room_type")
	private WebElement roomtype;
	
	@FindBy(id="Submit")
	private WebElement submit;

	public WebElement getLocatio() {
		return locatio;
	}

	public void setLocatio(WebElement locatio) {
		this.locatio = locatio;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public void setHotel(WebElement hotel) {
		this.hotel = hotel;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public void setRoomtype(WebElement roomtype) {
		this.roomtype = roomtype;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public void setSubmit(WebElement submit) {
		this.submit = submit;
	}

}
