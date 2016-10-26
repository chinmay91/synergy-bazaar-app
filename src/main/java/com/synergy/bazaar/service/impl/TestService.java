package com.synergy.bazaar.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.synergy.bazaar.dao.ITestDao;
import com.synergy.bazaar.dao.entity.TestEntity;
import com.synergy.bazaar.rest.user.vo.TestVO;
import com.synergy.bazaar.service.ITestService;

@Service("TestService")
public class TestService implements ITestService{
	
	@Autowired
	private ITestDao iTestDao;

	@Override
	public String addTest(TestVO testVO) {
		   TestEntity testEntity=new TestEntity();
		   BeanUtils.copyProperties(testVO, testEntity);
		   String result=iTestDao.addTest(testEntity);
		   return result;
	}

}
