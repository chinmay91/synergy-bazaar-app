package com.synergy.bazaar.mongo.entity;

import java.sql.Timestamp;
import java.util.Date;

public class MobileDisplay {

	private String screenSize;
	private String displayResolution;
	private String displayType;
	private String screenProtection;
	private String pixelDensity;
	private String multitouch;
	private String otherScreenFeatures;
	private Date dom;
	private Date doe;
	private String userid;

	public String getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(String screenSize) {
		this.screenSize = screenSize;
	}

	public String getDisplayResolution() {
		return displayResolution;
	}

	public void setDisplayResolution(String displayResolution) {
		this.displayResolution = displayResolution;
	}

	public String getDisplayType() {
		return displayType;
	}

	public void setDisplayType(String displayType) {
		this.displayType = displayType;
	}

	public String getScreenProtection() {
		return screenProtection;
	}

	public void setScreenProtection(String screenProtection) {
		this.screenProtection = screenProtection;
	}

	public String getPixelDensity() {
		return pixelDensity;
	}

	public void setPixelDensity(String pixelDensity) {
		this.pixelDensity = pixelDensity;
	}

	public String getMultitouch() {
		return multitouch;
	}

	public void setMultitouch(String multitouch) {
		this.multitouch = multitouch;
	}

	public String getOtherScreenFeatures() {
		return otherScreenFeatures;
	}

	public void setOtherScreenFeatures(String otherScreenFeatures) {
		this.otherScreenFeatures = otherScreenFeatures;
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

	public void setDoe(Timestamp doe) {
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
		return "MobileDisplay [screenSize=" + screenSize + ", displayResolution=" + displayResolution + ", displayType="
				+ displayType + ", screenProtection=" + screenProtection + ", pixelDensity=" + pixelDensity
				+ ", multitouch=" + multitouch + ", otherScreenFeatures=" + otherScreenFeatures + ", dom=" + dom
				+ ", doe=" + doe + ", userid=" + userid + "]";
	}

}
