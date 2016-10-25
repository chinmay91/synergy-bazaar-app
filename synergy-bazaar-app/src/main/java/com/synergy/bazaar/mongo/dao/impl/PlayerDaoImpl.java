/*package com.synergy.bazaar.mongo.dao.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import in.benchresources.cdm.player.PlayerType;

@Repository("PlayerDaoImpl")
public class PlayerDaoImpl {
	
	//-byType - by Qualifier -> by Name
	@Autowired
	private MongoTemplate mongoTemplate;
	
	public static final String COLLECTION_NAME = "players";
	
	public void addPlayer(PlayerType player) {
		if (!mongoTemplate.collectionExists(Person.class)) {
			mongoTemplate.createCollection(Person.class);
		}		
		player.setPlayerId(UUID.randomUUID().toString());
		mongoTemplate.insert(player, COLLECTION_NAME);
	}
	
	public List<PlayerType> listPlayers() {
		Query query = new Query();
		query.addCriteria(Criteria.where("name").is("Sohil"));
		return mongoTemplate.findAll(PlayerType.class, COLLECTION_NAME);
	}
	
	public List<PlayerType> findPlayerByName(String name) {
		Query query = new Query();
		query.addCriteria(Criteria.where("name").is(name));
		return mongoTemplate.find(query, PlayerType.class, COLLECTION_NAME);
	}
	
	
	public void deletePlayer(PlayerType player) {
		mongoTemplate.remove(player, COLLECTION_NAME);
	}
	
	public void updatePlayer(PlayerType player) {
		mongoTemplate.insert(player, COLLECTION_NAME);		
	}
}
*/