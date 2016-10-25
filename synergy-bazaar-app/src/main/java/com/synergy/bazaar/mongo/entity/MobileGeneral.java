package com.synergy.bazaar.mongo.entity;

import java.sql.Timestamp;
import java.util.Date;

public class MobileGeneral {
	
	private String model;
	private String brand;
	private String form;
	private String sims;
	private String simSize;
	private String color;
	private String otherFeatures;
	private String callFeatures;
	private Date dom;
	private Date doe;
	private String userid;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getForm() {
		return form;
	}

	public void setForm(String form) {
		this.form = form;
	}

	public String getSims() {
		return sims;
	}

	public void setSims(String sims) {
		this.sims = sims;
	}

	public String getSimSize() {
		return simSize;
	}

	public void setSimSize(String simSize) {
		this.simSize = simSize;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getOtherFeatures() {
		return otherFeatures;
	}

	public void setOtherFeatures(String otherFeatures) {
		this.otherFeatures = otherFeatures;
	}

	public String getCallFeatures() {
		return callFeatures;
	}

	public void setCallFeatures(String callFeatures) {
		this.callFeatures = callFeatures;
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
		return "MobileGeneral [model=" + model + ", brand=" + brand + ", form=" + form + ", sims=" + sims + ", simSize="
				+ simSize + ", color=" + color + ", otherFeatures=" + otherFeatures + ", callFeatures=" + callFeatures
				+ ", dom=" + dom + ", doe=" + doe + ", userid=" + userid + "]";
	}
}
