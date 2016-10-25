package com.synergy.bazaar.rest.landing.vo;

import java.sql.Timestamp;
public class MainSliderVO {

	private int sid;
	private String imageUrl;
	private String title;
	private String subtitle;
	private String offer;
	private Timestamp dom;
	private Timestamp doe;
	private String adminid;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getOffer() {
		return offer;
	}

	public void setOffer(String offer) {
		this.offer = offer;
	}

	public Timestamp getDom() {
		return dom;
	}

	public void setDom(Timestamp dom) {
		this.dom = dom;
	}

	public Timestamp getDoe() {
		return doe;
	}

	public void setDoe(Timestamp doe) {
		this.doe = doe;
	}

	public String getAdminid() {
		return adminid;
	}

	public void setAdminid(String adminid) {
		this.adminid = adminid;
	}
	
	

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	@Override
	public String toString() {
		return "MainSliderVO [sid=" + sid + ", imageUrl=" + imageUrl + ", title=" + title + ", subtitle=" + subtitle
				+ ", offer=" + offer + ", dom=" + dom + ", doe=" + doe + ", adminid=" + adminid + "]";
	}

}
