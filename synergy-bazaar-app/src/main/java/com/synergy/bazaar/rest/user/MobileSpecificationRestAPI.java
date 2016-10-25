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

import com.synergy.bazaar.mongo.entity.MobileDisplay;
import com.synergy.bazaar.mongo.entity.MobileGeneral;
import com.synergy.bazaar.mongo.service.IMobileSpecificationService;
import com.synergy.bazaar.rest.app.constant.ApplicationConstant;
import com.synergy.bazaar.rest.common.vo.MessageResponse;
import com.synergy.bazaar.rest.user.vo.MobileSpecificationVO;


@Path(ApplicationConstant.REST_VERSION)
@Service("MobileSpecificationRestAPI")
public class MobileSpecificationRestAPI {
	
		@Autowired
		private IMobileSpecificationService iMobileSpecificationService;
		
		
		@Path("/mobile-specification")
		@GET
		@Consumes(MediaType.APPLICATION_JSON)
		@Produces(MediaType.APPLICATION_JSON)
		public  MessageResponse testestest(){
			  MobileSpecificationVO mobileSpecificationVO=new MobileSpecificationVO();
		      MobileGeneral general=new MobileGeneral();
		      general.setBrand("HTC");
		      general.setModel("Desire 820G+");
		      general.setForm("Touch");
		      general.setSims("Dual");
		      general.setSimSize("Nano SIM ");
		      general.setColor("Santorini White");
		      general.setOtherFeatures("	Email, Wifi, GPRS, USB Connectivity, ");
		      general.setCallFeatures("Loudspeaker ");
		      general.setDoe(new Timestamp(new Date().getTime()));
		      general.setDom(new Timestamp(new Date().getTime()));
		      general.setUserid("8237ghsw");
		 	  
		      MobileDisplay display=new MobileDisplay();
		      display.setScreenSize("13.97 cm (5.5)");
		      display.setDisplayResolution("1280 x 720 Pixels");
		      display.setDisplayType("HD");
		      display.setScreenProtection("-");
		      display.setPixelDensity("-");
		      display.setMultitouch("Yes");
		      display.setOtherScreenFeatures("-");
		      display.setDoe(new Timestamp(new Date().getTime()));
		      display.setDom(new Timestamp(new Date().getTime()));
		      display.setUserid("8237ghsw");
		      
		      mobileSpecificationVO.setDisplay(display);
		      mobileSpecificationVO.setGeneral(general);
		      
		      String status=iMobileSpecificationService.addMobileSpecification(mobileSpecificationVO);

		      MessageResponse messageResponse=new MessageResponse();
		  	 messageResponse.setStatus(status);
			 messageResponse.setResponseCode("200");
			 messageResponse.setMessage("Hey! data is saved into database!!!!!!!!!!!!!!!!");
			 return messageResponse;
		}
		
		@Path("/mobile-specifications")
		@GET
		@Consumes(MediaType.APPLICATION_JSON)
		@Produces(MediaType.APPLICATION_JSON)
		public  List<MobileSpecificationVO> mobileSpecfications(){
			 List<MobileSpecificationVO> mobileSpecificationVOs=iMobileSpecificationService.listMobileSpecifications();
			 return mobileSpecificationVOs;
		}

}
