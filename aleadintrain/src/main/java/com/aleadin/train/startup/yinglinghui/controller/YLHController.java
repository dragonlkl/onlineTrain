package com.aleadin.train.startup.yinglinghui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aleadin.train.service.YLHService;

@Controller
public class YLHController {
	
	@Autowired
	YLHService service;
	
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
		String mainjson = service.createYLHMainData();
		return mainjson;
	}
	
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
	
	//
	@RequestMapping(value="/ylh/superstarcourse")
	public String superStarCourse()
	{
		return "superstarcourse";
	}
	
	@RequestMapping(value="/ylh/elitecourse")
	public String eliteCourse()
	{
		return "elitecourse";
	}
	
	//
	@RequestMapping(value="/ylh/topicarticle")
	public String topicArticle()
	{
		return "topicarticle";
	}
	
	@RequestMapping(value="/ylh/datebar")
	public String dateBar()
	{
		return "datebar";
	}
	@RequestMapping(value="/careerpreview/onlinecourse")
	public String onlineCourse()
	{
		return "careerpreviewonlinecourse";
	}
	
	@RequestMapping(value="/careerpreview/offlinecourse")
	public String offlineCourse()
	{
		return "careerpreviewofflinecourse";
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
