package com.synergy.bazaar.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.synergy.bazaar.dao.IMainSliderDao;
import com.synergy.bazaar.dao.base.AbstractCommonDao;
import com.synergy.bazaar.dao.entity.SliderEntity;

@Repository("MainSliderDao")
@Transactional
public class MainSliderDao  extends AbstractCommonDao<SliderEntity, Integer> implements IMainSliderDao{
	
	public MainSliderDao(){
		super(SliderEntity.class);
	}
	
	@Override
	public List<SliderEntity> loadMainSilder(){
		return  super.findAll();
	}

}
