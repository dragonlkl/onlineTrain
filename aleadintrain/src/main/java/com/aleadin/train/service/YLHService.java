package com.aleadin.train.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aleadin.train.dao.Const.DBConst;
import com.aleadin.train.dao.service.YlhDao;
import com.aleadin.train.dao.vo.ClassDetailVo;
import com.aleadin.train.dao.vo.ClassSurveyVO;
import com.aleadin.train.dao.vo.SlideVO;
import com.aleadin.train.model.CarouselSlideViewData;
import com.aleadin.train.model.CourseViewData;
import com.aleadin.train.model.EliteClassViewData;
import com.aleadin.train.model.YLHMainViewData;
import com.alibaba.fastjson.JSON;

@Component
public class YLHService {
	
	@Autowired
	private YlhDao ylhDao;
	
  public String queryYLHMainData()
  {
	  YLHMainViewData ylhMainData = new YLHMainViewData();
	  ylhMainData.setTitle("英领汇");
	  initYLHMainData(ylhMainData);
	  String mainData = JSON.toJSONString(ylhMainData);
	  return mainData;
  }
  
  private void initYLHMainData(YLHMainViewData ylhMainData)
  {
	 Map<String, Object> params = new HashMap<String, Object>();
	 params.put("position", DBConst.TBL_SLIDE_POSITION_YLHMAINSLIDE);
	 List<SlideVO> yhlMainslides = ylhDao.querySlideByPosition(params);
	//滚动广告
	  ArrayList<CarouselSlideViewData> cslide = new ArrayList<CarouselSlideViewData>();
	  for (int i = 0; i < yhlMainslides.size(); i++)
	  {
		  SlideVO slide = yhlMainslides.get(i);
		  CarouselSlideViewData slide1 = new CarouselSlideViewData();
		  slide1.setImgPath(slide.getImgPath());
		  slide1.setSlideID(slide.getID());
		  slide1.setTargetPath("/ylh/mainslide/"+slide.getObjectID());
		  cslide.add(slide1);
		
	  }
	  
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
	  
	  params = new HashMap<String, Object>();
	  List<ClassSurveyVO> surveys = ylhDao.queryClassSurvey(params);
	  //菁英课程
	  List<CourseViewData> eliteCourse = new ArrayList<CourseViewData>();
	  for (int i = 0; i < surveys.size(); i++) 
	  {
		  ClassSurveyVO csvo = surveys.get(i);  
		  CourseViewData  elitecviewData1 = new CourseViewData();
		  elitecviewData1.setLink("/ylh/eliteclass/"+csvo.getID());
		  elitecviewData1.setAuthorName(csvo.getRealName());
		  elitecviewData1.setCompany(csvo.getCompany());
		  elitecviewData1.setPosition(csvo.getPosition());
		  elitecviewData1.setTitle(csvo.getTitle());
		  elitecviewData1.setImagePath(csvo.getImgPath());
		  elitecviewData1.setIntroduce(csvo.getIntroduce());
		  eliteCourse.add(elitecviewData1);
	   }
	  ylhMainData.setEliteCourse(eliteCourse);
	  
  }
  
  public String queryEliteClassData(String classid)
  {
	  EliteClassViewData eliteClass = new EliteClassViewData();
	  Map<String, Object> params = new HashMap<String, Object>();
	  params.put("classid", classid);
	  List<ClassDetailVo> classlist = ylhDao.queryClassDetail(params);
	  if(classlist != null && classlist.get(0) != null)
	  {
		  ClassDetailVo cdVO = classlist.get(0);
		  eliteClass.setClassid(cdVO.getClassid());
		  eliteClass.setVediopath(cdVO.getVediopath());
		  eliteClass.setTitle(cdVO.getTitle());
		  eliteClass.setIntroduce(cdVO.getIntroduce());
		  eliteClass.setAuthorID(cdVO.getAuthorID());
		  eliteClass.setAuthorName(cdVO.getAuthorName());
		  eliteClass.setCompany(cdVO.getCompany());
		  eliteClass.setPosition(cdVO.getPosition());
		  List<String> authIntroduces =  new ArrayList<String>();
		  if(cdVO.getAuthIntroduce1() != null && cdVO.getAuthIntroduce1() != "")
		  {
			  authIntroduces.add(cdVO.getAuthIntroduce1());
		  }
		  if(cdVO.getAuthIntroduce2() != null && cdVO.getAuthIntroduce2() != "")
		  {
			  authIntroduces.add(cdVO.getAuthIntroduce2());
		  }
		  if(cdVO.getAuthIntroduce3() != null && cdVO.getAuthIntroduce3() != "")
		  {
			  authIntroduces.add(cdVO.getAuthIntroduce3());
		  }
		  eliteClass.setAuthIntroduces(authIntroduces);
		  eliteClass.setAuthImgPath(cdVO.getAuthImgPath());
	  }
	  Map<String, Object> params1 = new HashMap<String, Object>();
	  params1.put("classid", classid);
	  List<ClassSurveyVO> rclasslist = ylhDao.queryRelationClassSurvey(params1);
	  List<CourseViewData> relationClasses = new ArrayList<CourseViewData>();
	  if(rclasslist != null && rclasslist.size()>0)
	  {
		  for (int i = 0; i < rclasslist.size(); i++) 
		  {
			  ClassSurveyVO  csvo = rclasslist.get(i);
			  if(csvo != null)
			  {
				  CourseViewData  elitecviewData1 = new CourseViewData();
				  elitecviewData1.setLink("/ylh/eliteclass/"+csvo.getID());
				  elitecviewData1.setAuthorName(csvo.getRealName());
				  elitecviewData1.setCompany(csvo.getCompany());
				  elitecviewData1.setPosition(csvo.getPosition());
				  elitecviewData1.setTitle(csvo.getTitle());
				  elitecviewData1.setImagePath(csvo.getImgPath());
				  elitecviewData1.setIntroduce(csvo.getIntroduce());
				  relationClasses.add(elitecviewData1);
			  }
		  }
	  }
	  eliteClass.setRelationCourse(relationClasses);
	  String Data = JSON.toJSONString(eliteClass);
	  return Data;
  }
}
