package com.synergy.bazaar.mongo.service;

import java.util.List;

import com.synergy.bazaar.rest.user.vo.MobileSpecificationVO;

public interface IMobileSpecificationService {
	public String addMobileSpecification(MobileSpecificationVO mobileSpecificationVO);
	public List<MobileSpecificationVO> listMobileSpecifications();
}
