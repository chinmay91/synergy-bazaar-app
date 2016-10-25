package com.synergy.bazaar.mongo.entity;

public class MobileSpecificationEntity {
	private String mobileId;
	private MobileGeneral general;
	private MobileDisplay display;

	public String getMobileId() {
		return mobileId;
	}

	public void setMobileId(String mobileId) {
		this.mobileId = mobileId;
	}

	public MobileGeneral getGeneral() {
		return general;
	}

	public void setGeneral(MobileGeneral general) {
		this.general = general;
	}

	public MobileDisplay getDisplay() {
		return display;
	}

	public void setDisplay(MobileDisplay display) {
		this.display = display;
	}

	@Override
	public String toString() {
		return "MobileSpecificationEntity [general=" + general + ", display=" + display + "]";
	}
	
}
