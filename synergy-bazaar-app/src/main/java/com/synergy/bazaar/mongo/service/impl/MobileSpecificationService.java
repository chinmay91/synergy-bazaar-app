package com.synergy.bazaar.mongo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.synergy.bazaar.mongo.dao.IMobileSpecificationDao;
import com.synergy.bazaar.mongo.entity.MobileSpecificationEntity;
import com.synergy.bazaar.mongo.service.IMobileSpecificationService;
import com.synergy.bazaar.rest.user.vo.MobileSpecificationVO;

@Service("MobileSpecificationService")
public class MobileSpecificationService implements  IMobileSpecificationService{
	
	
	//-byType - by Qualifier -> by Name
	@Autowired
	private IMobileSpecificationDao iMobileSpecificationDao;

	@Override
	public String addMobileSpecification(MobileSpecificationVO mobileSpecificationVO) {
		MobileSpecificationEntity mobileSpecificationEntity=new  MobileSpecificationEntity();
		BeanUtils.copyProperties(mobileSpecificationVO, mobileSpecificationEntity);
		return iMobileSpecificationDao.addMobileSpecification(mobileSpecificationEntity);
	}

	@Override
	public List<MobileSpecificationVO> listMobileSpecifications() {
		List<MobileSpecificationVO> mobileSpecificationVOs=new ArrayList<>();
		 List<MobileSpecificationEntity> mobileSpecificationList= iMobileSpecificationDao.listMobileSpecifications();
		 for( MobileSpecificationEntity spe:mobileSpecificationList){
			 MobileSpecificationVO mobileSpecificationVO=new MobileSpecificationVO();
			 BeanUtils.copyProperties(spe, mobileSpecificationVO);
			 mobileSpecificationVOs.add(mobileSpecificationVO);
		 }
		return mobileSpecificationVOs;
	} 
	

}
