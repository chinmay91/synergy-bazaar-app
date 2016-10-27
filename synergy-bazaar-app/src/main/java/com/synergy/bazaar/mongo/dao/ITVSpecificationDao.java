package com.synergy.bazaar.mongo.dao;

import java.util.List;

import com.synergy.bazaar.mongo.entity.TVSpecificationEntity;

	public interface ITVSpecificationDao {
	public String addTVSpecification(TVSpecificationEntity tvSpecificationEntity);

	public List<TVSpecificationEntity> listTVSpecifications();

}
