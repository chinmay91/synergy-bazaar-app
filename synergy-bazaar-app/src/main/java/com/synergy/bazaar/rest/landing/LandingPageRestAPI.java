package com.synergy.bazaar.rest.landing;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.synergy.bazaar.rest.app.constant.ApplicationConstant;
import com.synergy.bazaar.rest.app.constant.LandingPageURI;
import com.synergy.bazaar.rest.landing.vo.MainSliderVO;
import com.synergy.bazaar.service.IMainSliderService;

@Service("LandingPageRestAPI")
@Path(ApplicationConstant.REST_VERSION)
public class LandingPageRestAPI {
	
	@Autowired
	 private IMainSliderService IMainSliderDao;
	
	@Path(LandingPageURI.MAIN_SLIDER)
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<MainSliderVO> showMainSliderImage(){
		List<MainSliderVO> mainSliderVOs=IMainSliderDao.loadMainSilder();
		return mainSliderVOs;
	}
	

}
