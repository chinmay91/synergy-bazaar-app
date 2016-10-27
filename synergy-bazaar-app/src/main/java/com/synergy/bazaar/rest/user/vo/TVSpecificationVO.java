package com.synergy.bazaar.rest.user.vo;

import com.synergy.bazaar.mongo.entity.TVAudioVideo;
import com.synergy.bazaar.mongo.entity.TVGeneral;

public class TVSpecificationVO {

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
		return "TVSpecificationVO [tvId=" + tvId + ", tvGeneral=" + tvGeneral + ", tvAudioVideo=" + tvAudioVideo
				+ "]";
	}
	
	
	

}

