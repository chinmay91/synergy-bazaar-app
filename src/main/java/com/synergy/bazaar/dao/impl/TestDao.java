package com.synergy.bazaar.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.synergy.bazaar.dao.ITestDao;
import com.synergy.bazaar.dao.base.AbstractCommonDao;
import com.synergy.bazaar.dao.entity.TestEntity;

@Repository("TestDao")
@Transactional
public class TestDao extends AbstractCommonDao<TestEntity, Integer> implements ITestDao{

	protected TestDao() {
		super(TestEntity.class );
	}
	
	@Override
	public String addTest(TestEntity testEntity){
		  return super.saveOrUpdate(testEntity);
	}

}
