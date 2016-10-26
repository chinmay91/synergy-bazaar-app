package com.synergy.bazaar.rest.user.vo;

import com.synergy.bazaar.mongo.entity.MobileCamera;
import com.synergy.bazaar.mongo.entity.MobileDisplay;
import com.synergy.bazaar.mongo.entity.MobileGeneral;
import com.synergy.bazaar.mongo.entity.MobileSoftware;

public class MobileSpecificationVO {
	private String mobileId;
	private MobileGeneral general;
	private MobileDisplay display;
	private MobileCamera mobileCamera;
	private MobileSoftware mobileSoftware;

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

	public MobileCamera getMobileCamera() {
		return mobileCamera;
	}

	public void setMobileCamera(MobileCamera mobileCamera) {
		this.mobileCamera = mobileCamera;
	}

	public MobileSoftware getMobileSoftware() {
		return mobileSoftware;
	}

	public void setMobileSoftware(MobileSoftware mobileSoftware) {
		this.mobileSoftware = mobileSoftware;
	}

	@Override
	public String toString() {
		return "MobileSpecificationVO [mobileId=" + mobileId + ", general=" + general + ", display=" + display
				+ ", mobileCamera=" + mobileCamera + ", mobileSoftware=" + mobileSoftware + "]";
	}

}
