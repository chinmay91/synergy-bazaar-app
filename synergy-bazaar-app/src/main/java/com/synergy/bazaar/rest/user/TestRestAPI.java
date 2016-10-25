package com.synergy.bazaar.rest.user;

import java.sql.Timestamp;
import java.util.Date;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.synergy.bazaar.rest.app.constant.ApplicationConstant;
import com.synergy.bazaar.rest.common.vo.MessageResponse;
import com.synergy.bazaar.rest.user.vo.TestVO;
import com.synergy.bazaar.service.ITestService;

@Controller("TestRestAPI")
@Path(ApplicationConstant.REST_VERSION)
public class TestRestAPI {
	
	@Autowired
	private ITestService iTestService;
	
	@Path("/test")
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public MessageResponse testTest(){
		 TestVO testVO=new TestVO();
		 testVO.setColor("red");
		 testVO.setName("TIKAKAK");
		 testVO.setDoe(new Timestamp(new Date().getTime()));
		 String status=iTestService.addTest(testVO);
		 MessageResponse messageResponse=new MessageResponse();
	  	 messageResponse.setStatus(status);
		 messageResponse.setResponseCode("200");
		 messageResponse.setMessage("Hey! data is saved into database!!!!!!!!!!!!!!!!");
		 return messageResponse;
	}

}
