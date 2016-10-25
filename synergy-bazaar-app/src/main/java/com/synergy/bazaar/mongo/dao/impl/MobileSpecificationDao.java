package com.synergy.bazaar.mongo.dao.impl;

import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.synergy.bazaar.mongo.dao.IMobileSpecificationDao;
import com.synergy.bazaar.mongo.entity.MobileSpecificationEntity;
import com.synergy.bazaar.rest.app.constant.ApplicationStatusMessage;

@Repository("MobileSpecificationDao")
public class MobileSpecificationDao implements  IMobileSpecificationDao{
	
	
	//-byType - by Qualifier -> by Name
	@Autowired
	private MongoTemplate mongoTemplate;
	
	public static final String COLLECTION_NAME = "mobile-specfications";
	
	@Override
	public String addMobileSpecification(MobileSpecificationEntity mobileSpecificationEntity) {
		try {
		/*	boolean ppp=mongoTemplate.collectionExists(MobileSpecificationEntity.class);
			boolean b=mongoTemplate.getCollectionNames().contains(COLLECTION_NAME);
			System.out.println("_@_@_@__@*******************************@@@@@@@@@@@@@@@@@@@@@@@@@@ YYY - "+b);
			System.out.println("_@_@_@__@*******************************@@@@@@@@@@@@@@@@@@@@@@@@@@ YYY - "+b);*/
		if (!mongoTemplate.getCollectionNames().contains(COLLECTION_NAME)) {
			mongoTemplate.createCollection(COLLECTION_NAME);
			mongoTemplate.createCollection(MobileSpecificationEntity.class);
		}		
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		
		System.out.println("_@_@_@__@*******************************@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("_@_@_@__@*******************************@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("_@_@_@__@*******************************@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		//mobileSpecificationEntity.setPlayerId(UUID.randomUUID().toString());
		mobileSpecificationEntity.setMobileId(UUID.randomUUID().toString());
		mongoTemplate.save(mobileSpecificationEntity,COLLECTION_NAME);
		return ApplicationStatusMessage.SUCCESS;
	}
	
	@Override
	public List<MobileSpecificationEntity> listMobileSpecifications() {
		/*Query query = new Query();
		query.addCriteria(Criteria.where("name").is("Sohil"));*/
		return mongoTemplate.findAll(MobileSpecificationEntity.class, COLLECTION_NAME);
	}
	

}
