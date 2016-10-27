package com.synergy.bazaar.mongo.entity;

public class TVSpecificationEntity {
	private String tvId;
	private TVGeneral tvGeneral;
	private TVAudioVideo tvAudioVideo;
	public String getTvId() {
		return tvId;
	}
	public void setTvId(String tvId) {
		this.tvId = tvId;
	}
	public TVGeneral getTvGeneral() {
		return tvGeneral;
	}
	public void setTvGeneral(TVGeneral tvGeneral) {
		this.tvGeneral = tvGeneral;
	}
	public TVAudioVideo getTvAudioVideo() {
		return tvAudioVideo;
	}
	public void setTvAudioVideo(TVAudioVideo tvAudioVideo) {
		this.tvAudioVideo = tvAudioVideo;
	}
	@Override
	public String toString() {
		return "TVSpecificationEntity [tvId=" + tvId + ", tvGeneral=" + tvGeneral + ", tvAudioVideo=" + tvAudioVideo
				+ "]";
	}
	
	
	

}
