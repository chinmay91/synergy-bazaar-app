package com.synergy.bazaar.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.synergy.bazaar.dao.IMainSliderDao;
import com.synergy.bazaar.dao.entity.SliderEntity;
import com.synergy.bazaar.rest.landing.vo.MainSliderVO;
import com.synergy.bazaar.service.IMainSliderService;


@Service("MainSliderService")
public class MainSliderService implements IMainSliderService{
	
	@Autowired
	private IMainSliderDao iIMainSliderDao;
	
	@Override
	public List<MainSliderVO> loadMainSilder(){
		List<MainSliderVO> mainSliderVOs=new ArrayList<>();
		List<SliderEntity> sliderListEntity=iIMainSliderDao.loadMainSilder();
		for(SliderEntity se:sliderListEntity){
			MainSliderVO mainSliderVO=new  MainSliderVO();
			BeanUtils.copyProperties(se, mainSliderVO);
			mainSliderVOs.add(mainSliderVO);
		}
		return mainSliderVOs;
	}

}
