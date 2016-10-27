package com.synergy.bazaar.mongo.dao.impl;

import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.synergy.bazaar.mongo.dao.ITVSpecificationDao;
import com.synergy.bazaar.mongo.entity.TVSpecificationEntity;
import com.synergy.bazaar.rest.app.constant.ApplicationStatusMessage;

@Repository("TVSpecificationDao")
public class TVSpecificationDao implements  ITVSpecificationDao{
	
	
	//-byType - by Qualifier -> by Name
	@Autowired
	private MongoTemplate mongoTemplate;
	
	public static final String COLLECTION_NAME = "TV-specfications";
	
	@Override
	public String addTVSpecification(TVSpecificationEntity tvSpecificationEntity) {
		try {
		/*	boolean ppp=mongoTemplate.collectionExists(MobileSpecificationEntity.class);
			boolean b=mongoTemplate.getCollectionNames().contains(COLLECTION_NAME);
			System.out.println("_@_@_@__@*******************************@@@@@@@@@@@@@@@@@@@@@@@@@@ YYY - "+b);
			System.out.println("_@_@_@__@*******************************@@@@@@@@@@@@@@@@@@@@@@@@@@ YYY - "+b);*/
		if (!mongoTemplate.getCollectionNames().contains(COLLECTION_NAME)) {
			mongoTemplate.createCollection(COLLECTION_NAME);
			mongoTemplate.createCollection(TVSpecificationEntity.class);
		}		
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		
		System.out.println("_@_@_@__@*******************************@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("_@_@_@__@*******************************@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("_@_@_@__@*******************************@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		//mobileSpecificationEntity.setPlayerId(UUID.randomUUID().toString());
		tvSpecificationEntity.setTvId(UUID.randomUUID().toString());
		mongoTemplate.save(tvSpecificationEntity,COLLECTION_NAME);
		return ApplicationStatusMessage.SUCCESS;
	}
	
	@Override
	public List<TVSpecificationEntity> listTVSpecifications() {
		/*Query query = new Query();
		query.addCriteria(Criteria.where("name").is("Sohil"));*/
		return mongoTemplate.findAll(TVSpecificationEntity.class, COLLECTION_NAME);
	}

	
	}
	


