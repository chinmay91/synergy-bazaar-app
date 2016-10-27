package com.synergy.bazaar.mongo.service;

import java.util.List;

import com.synergy.bazaar.rest.user.vo.TVSpecificationVO;

public interface ITVSpecificationService {
	public String addTVSpecification(TVSpecificationVO tvSpecificationVO);
	public List<TVSpecificationVO> listTVSpecifications();
}
