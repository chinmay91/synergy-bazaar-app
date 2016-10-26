package com.synergy.bazaar.mongo.entity;

import java.sql.Timestamp;
import java.util.Date;

public class MobileSoftware {
	
	private String osVersion;
	private String preInstalledApps; 	
	private String muliLanguagesSupported;
	private Date dom;
	private Date doe;
	private String userid;
	public String getOsVersion() {
		return osVersion;
	}
	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}
	public String getPreInstalledApps() {
		return preInstalledApps;
	}
	public void setPreInstalledApps(String preInstalledApps) {
		this.preInstalledApps = preInstalledApps;
	}
	public String getMuliLanguagesSupported() {
		return muliLanguagesSupported;
	}
	public void setMuliLanguagesSupported(String muliLanguagesSupported) {
		this.muliLanguagesSupported = muliLanguagesSupported;
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
		return "MobileSoftware [osVersion=" + osVersion + ", preInstalledApps=" + preInstalledApps
				+ ", muliLanguagesSupported=" + muliLanguagesSupported + ", dom=" + dom + ", doe=" + doe + ", userid="
				+ userid + "]";
	}
	
	
	

}
