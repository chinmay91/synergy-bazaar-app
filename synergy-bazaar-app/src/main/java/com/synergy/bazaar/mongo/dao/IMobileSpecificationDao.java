package com.synergy.bazaar.mongo.dao;

import java.util.List;

import com.synergy.bazaar.mongo.entity.MobileSpecificationEntity;

public interface IMobileSpecificationDao {

	public String addMobileSpecification(MobileSpecificationEntity mobileSpecificationEntity);

	public List<MobileSpecificationEntity> listMobileSpecifications();

}
