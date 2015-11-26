package com.aleadin.train.startup.yinglinghui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aleadin.train.service.YLHService;

@Controller
public class YLHController {
	
	@Autowired
	YLHService service;
	
	@RequestMapping(value="/test")
	public @ResponseBody String test()
	{
		return "test success";
	}
	
	@RequestMapping(value="/demo")
	public String demo()
	{
		return "demo";
	}
	
	@RequestMapping(value="/")
	public String index() {
		return "index";
	}
	
	@RequestMapping(value="/ylh/main.do")
	public String yinlinghuimain() {
		return "ylhIndex";
	}
	
	@RequestMapping(value="/ylh/main.json")
	public @ResponseBody String ylhMainData() {
		String mainjson = service.queryYLHMainData();
		return mainjson;
	}
	
	@RequestMapping(value="/ylh/yinlinghuimain.html")
	public String yinlinghuimainHtml() {
		return "yinlinghuimain";
	}
	
	@RequestMapping(value="/ylh/eliteclass.html")
	public String ylhEliteClass() {
		return "eliteclass";
	}
	
	@RequestMapping(value="/ylh/eliteclass.json/{classid}")
	public  @ResponseBody String ylhEliteClassData(@PathVariable String classid) {
		String eliteClassJson = service.queryEliteClassData(classid);
		return eliteClassJson;
	}
	
	
	@RequestMapping(value="/ylh/superstarcourse.html")
	public String superStarCourse()
	{
		return "superstarcourse";
	}
	
	@RequestMapping(value="/ylh/superstarcourse.json")
	public  @ResponseBody String superStarCourseData() {
		String JsonData = service.querySupperStarCourseData();
		return JsonData;
	}
	
	@RequestMapping(value="/ylh/elitecourse.html")
	public String eliteCourse()
	{
		return "elitecourse";
	}
	
	@RequestMapping(value="/ylh/elitecourse.json")
	public  @ResponseBody String eliteCourseData() {
		String eliteCourseJson = service.queryEliteCourseData();
		return eliteCourseJson;
	}
	
	@RequestMapping(value="/ylh/topicarticle.html")
	public String topicArticle()
	{
		return "topicarticle";
	}
	
	@RequestMapping(value="/ylh/topicarticle.json")
	public  @ResponseBody String topicArticleData() {
		String JsonData = service.queryTopicArticleData();
		return JsonData;
	}
	
	@RequestMapping(value="/ylh/datebar.html")
	public String dateBar()
	{
		return "datebar";
	}
	
	@RequestMapping(value="/ylh/datebar.json")
	public  @ResponseBody String dateBarData() {
		String JsonData = service.queryDateBarData();
		return JsonData;
	}
	
	@RequestMapping(value="/careerpreview/careerpreviewonlinecourse.html")
	public String onlineCourse()
	{
		return "careerpreviewonlinecourse";
	}
	
	@RequestMapping(value="/careerpreview/onlinecourse.json")
	public  @ResponseBody String onlineCourseData() {
		String JsonData = service.queryOnlineCourseData();
		return JsonData;
	}
	
	@RequestMapping(value="/careerpreview/careerpreviewofflinecourse.html")
	public String offlineCourse()
	{
		return "careerpreviewonlinecourse";
	}
	
	@RequestMapping(value="/careerpreview/offlinecourse.json")
	public  @ResponseBody String offlineCourseData() {
		String JsonData = service.queryOfflineCourseData();
		return JsonData;
	}
	
	@RequestMapping(value="/my/accountmgr")
	public String accountMgr()
	{
		return "accountmgr";
	}
	
	@RequestMapping(value="/my/ijionyou")
	public String iJionYou()
	{
		return "ijionyou";
	}
	
	@RequestMapping(value="/my/becomeelite")
	public String becomeElite()
	{
		return "becomeelite";
	}
	
	@RequestMapping(value="/my/eliteclub")
	public String eliteClub()
	{
		return "eliteclub";
	}
	
	@RequestMapping(value="/my/myorder")
	public String myOrder()
	{
		return "myorder";
	}
}
