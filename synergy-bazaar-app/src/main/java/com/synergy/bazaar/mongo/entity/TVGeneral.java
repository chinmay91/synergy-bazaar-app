package com.synergy.bazaar.mongo.entity;

import java.util.Date;

public class TVGeneral {
	private String brand;
	private String model;
	private String screenType;
	private String additionalFunctionality;
	private String screenSize;
	private String color;
	private String displayFeature;
	private String displayResolution;
	private Date dom;
	private Date doe;
	private String userid;
	
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getScreenType() {
		return screenType;
	}
	public void setScreenType(String screenType) {
		this.screenType = screenType;
	}
	public String getAdditionalFunctionality() {
		return additionalFunctionality;
	}
	public void setAdditionalFunctionality(String additionalFunctionality) {
		this.additionalFunctionality = additionalFunctionality;
	}
	public String getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(String screenSize) {
		this.screenSize = screenSize;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getDisplayFeature() {
		return displayFeature;
	}
	public void setDisplayFeature(String displayFeature) {
		this.displayFeature = displayFeature;
	}
	public String getDisplayResolution() {
		return displayResolution;
	}
	public void setDisplayResolution(String displayResolution) {
		this.displayResolution = displayResolution;
	}
	public Date getDom() {
		return dom;
	}
	public void setDom(Date dom) {
		this.dom = dom;
	}
	public Date getDoe() {
		return doe;
	}
	public void setDoe(Date doe) {
		this.doe = doe;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	@Override
	public String toString() {
		return "TVGeneral [brand=" + brand + ", model=" + model + ", screenType=" + screenType
				+ ", additionalFunctionality=" + additionalFunctionality + ", screenSize=" + screenSize + ", color="
				+ color + ", displayFeature=" + displayFeature + ", displayResolution=" + displayResolution + ", dom="
				+ dom + ", doe=" + doe + ", userid=" + userid + "]";
	}
	
}
