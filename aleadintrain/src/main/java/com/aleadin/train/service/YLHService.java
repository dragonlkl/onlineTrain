package com.aleadin.train.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.aleadin.train.model.CarouselSlideViewData;
import com.aleadin.train.model.CourseViewData;
import com.aleadin.train.model.YLHMainViewData;
import com.alibaba.fastjson.JSON;

@Service
public class YLHService {
  public String createYLHMainData()
  {
	  YLHMainViewData ylhMainData = new YLHMainViewData();
	  ylhMainData.setTitle("英领汇");
	  //滚动广告
	  ArrayList<CarouselSlideViewData> cslide = new ArrayList<CarouselSlideViewData>();
	  CarouselSlideViewData slide1 = new CarouselSlideViewData();
	  slide1.setImgPath("../img/slide1.jpg");
	  slide1.setSlideID("YLHMainSlide1");
	  slide1.setTargetPath("/ylh/objectid1");
	  cslide.add(slide1);
	  
	  CarouselSlideViewData slide2 = new CarouselSlideViewData();
	  slide2.setImgPath("../img/slide2.jpg");
	  slide2.setSlideID("YLHMainSlide2");
	  slide2.setTargetPath("/ylh/objectid2");
	  cslide.add(slide2);
	  
	  CarouselSlideViewData slide3 = new CarouselSlideViewData();
	  slide3.setImgPath("../img/slide3.jpg");
	  slide3.setSlideID("YLHMainSlide3");
	  slide3.setTargetPath("/ylh/objectid3");
	  cslide.add(slide3);
	  
	  ylhMainData.setYLHMainslides(cslide);
	  //大咖课程列表
	  List<CourseViewData> superStarcousre = new ArrayList<CourseViewData>();
	  CourseViewData  cviewData1 = new CourseViewData();
	  cviewData1.setAuthorName("何蓉蓉");
	  cviewData1.setCompany("艾英领");
	  cviewData1.setPosition("CEO");
	  cviewData1.setTitle("艾英领 CEO : 告诉你老板喜欢什么样的人，面试如何从容应对老板的提问，增加面试成功率");
	  cviewData1.setImagePath("../img/img_1.jpg");
	  cviewData1.setIntroduce("不同的公司有不同的文化，不同的CEO有不同的性格，在面试时如鹅观察老板的举动，了解什么样的老板喜欢什么样的员工");
	  superStarcousre.add(cviewData1);
	  
	  
	  
	  
	  
	  String mainData = JSON.toJSONString(ylhMainData);
	  return mainData;
			  
  }
}
