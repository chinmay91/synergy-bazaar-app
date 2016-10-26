package com.synergy.bazaar.mongo.entity;

import java.util.Date;

public class MobileCamera {

	private String rearCamera;
	private boolean autoFocus;
	private boolean flash;
	private String frontCamera;
	private String otherCameraFeatures;
	private Date dom;
	private Date doe;
	private String userid;
	
	
	public String getRearCamera() {
		return rearCamera;
	}
	public void setRearCamera(String rearCamera) {
		this.rearCamera = rearCamera;
	}
	public boolean isAutoFocus() {
		return autoFocus;
	}
	public void setAutoFocus(boolean autoFocus) {
		this.autoFocus = autoFocus;
	}
	public boolean isFlash() {
		return flash;
	}
	public void setFlash(boolean flash) {
		this.flash = flash;
	}
	public String getFrontCamera() {
		return frontCamera;
	}
	public void setFrontCamera(String frontCamera) {
		this.frontCamera = frontCamera;
	}
	public String getOtherCameraFeatures() {
		return otherCameraFeatures;
	}
	public void setOtherCameraFeatures(String otherCameraFeatures) {
		this.otherCameraFeatures = otherCameraFeatures;
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
		return "MobileCamera [rearCamera=" + rearCamera + ", autoFocus=" + autoFocus + ", flash=" + flash
				+ ", frontCamera=" + frontCamera + ", otherCameraFeatures=" + otherCameraFeatures + ", dom=" + dom
				+ ", doe=" + doe + ", userid=" + userid + "]";
	}
	
	
	
}
