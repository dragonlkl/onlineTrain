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
	  initDemoData(ylhMainData);
	  String mainData = JSON.toJSONString(ylhMainData);
	  return mainData;
  }
  
  private void initDemoData(YLHMainViewData ylhMainData)
  {
	//滚动广告
	  ArrayList<CarouselSlideViewData> cslide = new ArrayList<CarouselSlideViewData>();
	  CarouselSlideViewData slide1 = new CarouselSlideViewData();
	  slide1.setImgPath("/img/slide1.jpg");
	  slide1.setSlideID("YLHMainSlide1");
	  slide1.setTargetPath("/ylh/objectid1");
	  cslide.add(slide1);
	  
	  CarouselSlideViewData slide2 = new CarouselSlideViewData();
	  slide2.setImgPath("/img/slide2.jpg");
	  slide2.setSlideID("YLHMainSlide2");
	  slide2.setTargetPath("/ylh/objectid2");
	  cslide.add(slide2);
	  
	  CarouselSlideViewData slide3 = new CarouselSlideViewData();
	  slide3.setImgPath("/img/slide3.jpg");
	  slide3.setSlideID("YLHMainSlide3");
	  slide3.setTargetPath("/ylh/objectid3");
	  cslide.add(slide3);
	  
	  ylhMainData.setYLHMainslides(cslide);
	  //大咖课程列表
	  List<CourseViewData> superStarcousre = new ArrayList<CourseViewData>();
	  CourseViewData  cviewData1 = new CourseViewData();
	  cviewData1.setLink("#");
	  cviewData1.setAuthorName("何蓉蓉");
	  cviewData1.setCompany("艾英领");
	  cviewData1.setPosition("CEO");
	  cviewData1.setTitle("艾英领 CEO : 告诉你老板喜欢什么样的人，面试如何从容应对老板的提问，增加面试成功率");
	  cviewData1.setImagePath("/img/img_1.jpg");
	  cviewData1.setIntroduce("不同的公司有不同的文化，不同的CEO有不同的性格，在面试时如鹅观察老板的举动，了解什么样的老板喜欢什么样的员工");
	  superStarcousre.add(cviewData1);
	  
	  CourseViewData  cviewData2 = new CourseViewData();
	  cviewData1.setLink("#");
	  cviewData2.setAuthorName("tony");
	  cviewData2.setCompany("艾英领");
	  cviewData2.setPosition("CXO");
	  cviewData2.setTitle("艾英领 CXO : 告诉你什么样的建立最吸引人，如何写好简历，增加面试成功率");
	  cviewData2.setImagePath("/img/img_1.jpg");
	  cviewData2.setIntroduce("不同的公司有不同的文化，不同的CXO有不同的性格，在面试时如鹅观察老板的举动，了解什么样的CXO喜欢什么样的员工");
	  superStarcousre.add(cviewData2);
	  
	  ylhMainData.setSuperStarCourse(superStarcousre);
	  
	  //菁英课程
	  List<CourseViewData> eliteCourse = new ArrayList<CourseViewData>();
	  CourseViewData  elitecviewData1 = new CourseViewData();
	  cviewData1.setLink("#");
	  elitecviewData1.setAuthorName("mars");
	  elitecviewData1.setCompany("艾英领");
	  elitecviewData1.setPosition("CMO");
	  elitecviewData1.setTitle("艾英领 CMO : 告诉你面试市场销售人员的关键，面试如何应对面试官的提问");
	  elitecviewData1.setImagePath("/img/img_1.jpg");
	  elitecviewData1.setIntroduce("不同的公司有不同的文化，不同的CMO有不同的性格，在面试时如鹅观察老板的举动，了解什么样的CMO喜欢什么样的员工");
	  eliteCourse.add(elitecviewData1);
	  
	  CourseViewData  elitecviewData2 = new CourseViewData();
	  cviewData1.setLink("#");
	  elitecviewData2.setAuthorName("dennis");
	  elitecviewData2.setCompany("艾英领");
	  elitecviewData2.setPosition("CTO");
	  elitecviewData2.setTitle("艾英领 CTO : 告诉如何准备专业的面试，如何应对专业面试问题");
	  elitecviewData2.setImagePath("/img/img_1.jpg");
	  elitecviewData2.setIntroduce("不同的公司有不同的文化，不同的CTO有不同的性格，在面试时如鹅观察老板的举动，了解什么样的CTO喜欢什么样的员工");
	  eliteCourse.add(elitecviewData2);
	  
	  ylhMainData.setSuperStarCourse(eliteCourse);
	  
  }
}
