package com.synergy.bazaar.mongo.entity;

public class MobileSpecificationEntity {
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
		return "MobileSpecificationEntity [mobileId=" + mobileId + ", general=" + general + ", display=" + display
				+ ", mobileCamera=" + mobileCamera + ", mobileSoftware=" + mobileSoftware + "]";
	}

}
