package com.synergy.bazaar.rest.user.vo;

import com.synergy.bazaar.mongo.entity.MobileDisplay;
import com.synergy.bazaar.mongo.entity.MobileGeneral;

public class MobileSpecificationVO {
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
		return "MobileSpecificationVO [mobileId=" + mobileId + ", general=" + general + ", display=" + display + "]";
	}
	
}
