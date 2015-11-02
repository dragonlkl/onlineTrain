package com.aleadin.train.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.aleadin.train.dao.vo.CarouselSlideVO;
import com.aleadin.train.model.YLHMainData;
import com.alibaba.fastjson.JSON;

@Service
public class YLHService {
  public String createYLHMainData()
  {
	  YLHMainData ylhMainData = new YLHMainData();
	  ylhMainData.setTitle("英领汇");
	  ArrayList<CarouselSlideVO> cslide = new ArrayList<CarouselSlideVO>();
	  CarouselSlideVO slide1 = new CarouselSlideVO();
	  slide1.setImgPath("");
	  ylhMainData.setYLHMainslides(cslide);
	  String mainData = JSON.toJSONString(ylhMainData);
	  return mainData;
			  
  }
}
