package com.synergy.bazaar.rest.user;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.synergy.bazaar.mongo.entity.TVAudioVideo;
import com.synergy.bazaar.mongo.entity.TVGeneral;
import com.synergy.bazaar.mongo.service.ITVSpecificationService;
import com.synergy.bazaar.rest.app.constant.ApplicationConstant;
import com.synergy.bazaar.rest.common.vo.MessageResponse;
import com.synergy.bazaar.rest.user.vo.TVSpecificationVO;


@Path(ApplicationConstant.REST_VERSION)
@Service("TVSpecificationRestAPI")
public class TVSpecificationRestAPI {
	
		@Autowired
		private ITVSpecificationService iTVSpecificationService;
		
		
		@Path("/tv-specification")
		@GET
		@Consumes(MediaType.APPLICATION_JSON)
		@Produces(MediaType.APPLICATION_JSON)
		public  MessageResponse testestest(){
			  TVSpecificationVO tvSpecificationVO=new TVSpecificationVO();
		      TVGeneral general=new TVGeneral();
		      general.setBrand("Samsung");
		      general.setModel("UA 32FH4003 R");
		      general.setScreenSize("80 cm (32)");
		      general.setScreenType("LED");
		      general.setColor("RGB");
		      general.setDisplayFeature("HD Ready");
		      general.setAdditionalFunctionality("yes");
		      general.setDisplayResolution("1366 x 768 ");
		      general.setDoe(new Timestamp(new Date().getTime()));
		      general.setDom(new Timestamp(new Date().getTime()));
		      general.setUserid("8237ghsw");
		 	 
		      TVAudioVideo tvAudioVideo=new TVAudioVideo();
		      tvAudioVideo.setDynamicRatio("Mega Contrast");
		      tvAudioVideo.setRefreshRate("100 hertz");
		      tvAudioVideo.setAdditionalVideoFeatures("Picture Engine: HyperReal Engine, Wide Color Enhancer (Plus), Film Mode, Analog Tuner, Digital Clean View, Triple Protector, ECO Feature: Eco Mark - Planet First, Energy Efficiency Class - A Plus");
		      tvAudioVideo.setNoOfSpeakers(2);
		      tvAudioVideo.setSoundOutput("10 watts ");
		      tvAudioVideo.setSoundTechnology("Dolby Digital Plus, Dolby Pulse");
		      tvAudioVideo.setAdditionalAudioFeatures("DTS Studio Sound / DNSePlus, DTS Premium Sound / DTS Premium Sound 5.1, Auto Volume Leveler, Speaker Type: Down Firing Plus Full Range ");
		     
		      tvSpecificationVO.setTvAudioVideo(tvAudioVideo);
		      tvSpecificationVO.setTvGeneral(general);
		      
		      String status=iTVSpecificationService.addTVSpecification(tvSpecificationVO);

		      MessageResponse messageResponse=new MessageResponse();
		  	 messageResponse.setStatus(status);
			 messageResponse.setResponseCode("200");
			 messageResponse.setMessage("Hey! data is saved into database!!!!!!!!!!!!!!!!");
			 return messageResponse;
		}
		
		@Path("/tv-specifications")
		@GET
		@Consumes(MediaType.APPLICATION_JSON)
		@Produces(MediaType.APPLICATION_JSON)
		public  List<TVSpecificationVO> tvSpecfications(){
			 List<TVSpecificationVO> TVSpecificationVOs=iTVSpecificationService.listTVSpecifications();
			 return TVSpecificationVOs;
		}

}
