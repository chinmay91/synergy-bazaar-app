package com.synergy.bazaar.mongo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.synergy.bazaar.mongo.dao.ITVSpecificationDao;
import com.synergy.bazaar.mongo.entity.TVSpecificationEntity;
import com.synergy.bazaar.mongo.service.ITVSpecificationService;
import com.synergy.bazaar.rest.user.vo.TVSpecificationVO;

@Service("TVSpecificationService")
public class TVSpecificationService implements  ITVSpecificationService{
	
	
	//-byType - by Qualifier -> by Name
	@Autowired
	private ITVSpecificationDao iTVSpecificationDao;

	@Override
	public String addTVSpecification(TVSpecificationVO tvSpecificationVO) {
		TVSpecificationEntity tvSpecificationEntity=new  TVSpecificationEntity();
		BeanUtils.copyProperties(tvSpecificationVO, tvSpecificationEntity);
		return iTVSpecificationDao.addTVSpecification(tvSpecificationEntity);
	}

	@Override
	public List<TVSpecificationVO> listTVSpecifications() {
		List<TVSpecificationVO> tvSpecificationVOs=new ArrayList<>();
		 List<TVSpecificationEntity> tvSpecificationList= iTVSpecificationDao.listTVSpecifications();
		 for( TVSpecificationEntity spe:tvSpecificationList){
			 TVSpecificationVO tvSpecificationVO=new TVSpecificationVO();
			 BeanUtils.copyProperties(spe, tvSpecificationVO);
			 tvSpecificationVOs.add(tvSpecificationVO);
		 }
		return tvSpecificationVOs;
	} 
	

}
