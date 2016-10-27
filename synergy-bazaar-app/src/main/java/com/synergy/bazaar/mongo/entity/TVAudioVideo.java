package com.synergy.bazaar.mongo.entity;

import java.util.Date;

public class TVAudioVideo {
	
	private String dynamicRatio;
	private String refreshRate;
	private String additionalVideoFeatures;
	private int noOfSpeakers;
	private String soundOutput;
	private String soundTechnology;
	private String additionalAudioFeatures;
	private Date dom;
	private Date doe;
	private String userid;
	public String getDynamicRatio() {
		return dynamicRatio;
	}
	public void setDynamicRatio(String dynamicRatio) {
		this.dynamicRatio = dynamicRatio;
	}
	public String getRefreshRate() {
		return refreshRate;
	}
	public void setRefreshRate(String refreshRate) {
		this.refreshRate = refreshRate;
	}
	public String getAdditionalVideoFeatures() {
		return additionalVideoFeatures;
	}
	public void setAdditionalVideoFeatures(String additionalVideoFeatures) {
		this.additionalVideoFeatures = additionalVideoFeatures;
	}
	public int getNoOfSpeakers() {
		return noOfSpeakers;
	}
	public void setNoOfSpeakers(int noOfSpeakers) {
		this.noOfSpeakers = noOfSpeakers;
	}
	public String getSoundOutput() {
		return soundOutput;
	}
	public void setSoundOutput(String soundOutput) {
		this.soundOutput = soundOutput;
	}
	public String getSoundTechnology() {
		return soundTechnology;
	}
	public void setSoundTechnology(String soundTechnology) {
		this.soundTechnology = soundTechnology;
	}
	public String getAdditionalAudioFeatures() {
		return additionalAudioFeatures;
	}
	public void setAdditionalAudioFeatures(String additionalAudioFeatures) {
		this.additionalAudioFeatures = additionalAudioFeatures;
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
		return "TVAudioVedio [dynamicRatio=" + dynamicRatio + ", refreshRate=" + refreshRate
				+ ", additionalVideoFeatures=" + additionalVideoFeatures + ", noOfSpeakers=" + noOfSpeakers
				+ ", soundOutput=" + soundOutput + ", soundTechnology=" + soundTechnology + ", additionalAudioFeatures="
				+ additionalAudioFeatures + ", dom=" + dom + ", doe=" + doe + ", userid=" + userid + "]";
	}
	
	
}
